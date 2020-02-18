import { Component, OnInit } from '@angular/core';
import { DataserviceService } from '../dataservice.service';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {
name="mark smith"
currentdate=new Date();
/*public employees=[
  {"empid":1,"empName":"john","gender":"Male","salary":4000,"dateofbirth":"02/04/2020" },
  {"empid":2,"empName":"Doe","gender":"Male","salary":4400,"dateofbirth":"02/02/2020" },
  {"empid":3,"empName":"shane","gender":"Female","salary":4300,"dateofbirth":"02/06/2020" },
  {"empid":4,"empName":"watson","gender":"Female","salary":4200,"dateofbirth":"02/08/2020" }
]*/
public employees=[{}]
  constructor(private dataservice:DataserviceService) { 
    this.dataservice.getEmployees().subscribe(
    data => this.employees=data);
  }

  ngOnInit(): void {
    
  }

}
