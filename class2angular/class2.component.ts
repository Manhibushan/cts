import { Component, OnInit } from "@angular/core";

@Component({
  selector: "app-class2",
  templateUrl: "./class2.component.html",
  styleUrls: ["./class2.component.css"]
})
export class Class2Component implements OnInit {
  number = "one";
  names = ["Mark", "John", "Doe", "smith"];
  employees = [];
  constructor() {
    this.employees = [
      { empid: "1", empname: "Mark", age: 20 },
      { empid: "2", empname: "smith", age: 30 },
      { empid: "3", empname: "John", age: 25 },
      { empid: "4", empname: "Doe", age: 20 }
    ];
  }
  onButtonClicked() {
    this.employees = [
      { empid: "1", empname: "Mark", age: 20 },
      { empid: "2", empname: "smith", age: 30 },
      { empid: "3", empname: "John", age: 25 },
      { empid: "4", empname: "Doe", age: 20 },
      { empid: "5", empname: "Tendulkar", age: 40 }
    ];
  }
  trackByEmpId(employee, index) {
    return employee.empname;
  }

  ngOnInit(): void {}
}
