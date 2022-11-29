import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductServiceService {

  constructor(private http:HttpClient) { }

  public getAllProduct() {
    return this.http.get("http://localhost:8080/api/v1/products");
  }

  public SearchProduct(name:any) {
    return this.http.get("http://localhost:8080/api/v1/products/"+name);
  }

  public RegisterUser(User:any) {
    return this.http.post("http://localhost:8080/api/v1/user", User, {responseType:'text' as 'json'})
  }


}
