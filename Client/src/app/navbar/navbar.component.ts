import { User } from './../Entity/UserEnity';
import { ProductServiceService } from './../product-service.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  showLogin: Boolean = false;
  showRegister: Boolean = false;

  constructor(private service:ProductServiceService) { }

  user:User = new User();
  dummy:any;
  ngOnInit(): void {
    
  }

  showLoginTab() {
    this.showLogin = !this.showLogin;
    this.showRegister = false;
  }
  showRegisterTab() {
    this.showRegister = !this.showRegister;
    this.showLogin = false;
  }

  public RegisterUser() {
    let response = this.service.RegisterUser(this.user);
    response.subscribe((data:any) => this.dummy=data);
  }

}
