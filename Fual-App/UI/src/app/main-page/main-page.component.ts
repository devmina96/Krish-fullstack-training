import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  templateUrl: './main-page.component.html',
  styleUrls: ['./main-page.component.scss']
})
export class MainPageComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  loadOrder(){
      this.router.navigate(['order'])
  }

}
