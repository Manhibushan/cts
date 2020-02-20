import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/models/user.model';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
public interests=[
 
    'Bakery','Drinks','Deserts'
 
]
public userModel=new User('John', 'john@gmail.com','545555454','','male',true);
  constructor() { }

  ngOnInit(): void {
  }

}
