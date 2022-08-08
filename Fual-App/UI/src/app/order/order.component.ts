import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'fd-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.scss']
})
export class OrderComponent implements OnInit {
  postid: any;
  constructor(private http:HttpClient) { }

  ngOnInit(): void {
  }


  submitOrder(orderDetails: {Id: number, FualType: string, Capacity: string}){
    console.log(orderDetails)
    this.http.post("http://localhost:8181/kafka/order", orderDetails, {responseType:'text' as 'json'})
    .subscribe((res)=>{
      console.log(res);
      if(res=="Success"){
          this.postid = "Your Order is placed. Check Inquiry to get the details later."
      }
      else{
        this.postid = "Your order is faild. Try again."
      }
    });
  }
}
