import { Component, OnInit } from '@angular/core';
import { DataserviceService } from '../dataservice.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
public employees=[
  {}
]
  constructor(private dataservice:DataserviceService) { }

  ngOnInit(): void {
    this.dataservice.getEmployees().subscribe(
    data => this.employees=data);
  }

}
