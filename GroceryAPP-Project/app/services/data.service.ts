import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class DataService {
private _baseurl="http://apolis-grocery.herokuapp.com/api/"
private _categoryurl="category"
private _subcat="subcategory/"
private _productsurl="products/"
  constructor(private http:HttpClient) { }
  getCategories(): Observable <any []>
  {
    return this.http.get<any []>(`${this._baseurl + this._categoryurl}` )


  }
  getSubCategory(catId): Observable<any>{
    return this.http.get<any>(`${this._baseurl + this._subcat + catId}`)
  }
  getProducts(subId):Observable<any>
  {
    return this.http.get<any>(  ` ${this._baseurl+this._productsurl+subId} `)
  }
}
