const express = require('express')
const Schedulerr = require('../module/shedule')
const producer = require('./producer')

async function scheduleIncomingMesssage(message) {
  console.log("called..")
    const data = JSON.parse(message.value.toString());
    const { id, type, capacity, status } = data;


    const randomDate = new Date(
        new Date().getTime() + Math.random() * (7 * 24 * 60 * 60 * 1000)
      );

      try {
        const scheduler = new Schedulerr ({
            id,
            type,
            capacity,
            status: "scheduled",
            shippingDate: randomDate
        })

        try {
            const savedState = await scheduler.save()
            console.log(savedState)
            await producer.publish(savedState, savedState.id)

        } catch (error) {
            console.log(error)
        }
        
      } catch (error) {
        console.log(error)
      }

      return;

}
module.exports = {scheduleIncomingMesssage}
