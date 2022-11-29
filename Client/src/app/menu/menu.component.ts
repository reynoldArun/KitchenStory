import { ProductServiceService } from './../product-service.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  products:any;


  constructor(private service:ProductServiceService) { }

  ngOnInit(): void {
    let response = this.service.getAllProduct()
    response.subscribe((data:any) => this.products=data)
  }

  

}
