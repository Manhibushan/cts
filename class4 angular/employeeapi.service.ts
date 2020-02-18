import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs';
import { IPost } from './post';
@Injectable({
  providedIn: 'root'
})
export class EmployeeapiService {
  private _url="https://jsonplaceholder.typicode.com/posts"
  constructor( private http:HttpClient) { }
  getEmployees(): Observable <IPost []>
  {
    return this.http.get<IPost []>(this._url)
  }
}

