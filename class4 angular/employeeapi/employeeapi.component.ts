import { Component, OnInit } from '@angular/core';
import { EmployeeapiService } from '../employeeapi.service';
import { IPost } from '../post';

@Component({
  selector: 'app-employeeapi',
  templateUrl: './employeeapi.component.html',
  styleUrls: ['./employeeapi.component.css']
})
export class EmployeeapiComponent implements OnInit {
  /*public employees=[
    {}
  ]*/
  public posts :IPost[]=[];
  constructor(private employeeapiservice:EmployeeapiService) { }

  ngOnInit(): void {
    this.employeeapiservice.getEmployees().subscribe(
      data => this.posts=data);
  }

}
