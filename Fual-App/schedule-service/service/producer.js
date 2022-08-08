
const Kafka = require('kafkajs').Kafka

const kafka = new Kafka({
  clientId: 'schedule-topic-produce',
  brokers: ['localhost:9092'],
});

const producer = kafka.producer();

const publish = async (data, uuid) => {
  await producer
    .connect()
    .catch((e) => console.error('error on connecting to Kafka', e));

    const newData = { data, uuid };
    console.log("produced....")

    await producer.send({
      topic: 'schedule-state',
      messages: [{key: JSON.stringify(uuid), value: JSON.stringify(newData)}],
    });
};
publish().catch((e) => console.error(e));

module.exports = {publish}