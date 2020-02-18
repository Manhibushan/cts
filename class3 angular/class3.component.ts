import { Component, OnInit, Input } from '@angular/core';
import { AppComponent } from '../app.component';

@Component({
  selector: 'app-class3',
  templateUrl:"./class3.component.html",
  /*`
  
<p>Template Reference Variable</p>
<input type="text" #myInput/>

<button (click)="onButtonClick(myInput.value)">Button</button>
<p> Two way Data Binding</p>
<h1>{{ name }}<h1>
<input type="text" [(ngModel)]="name"/>

  
`,*/
  styleUrls: ['./class3.component.css']
})
export class Class3Component implements OnInit {

  @Input()
  public parentData;
  




/*name="mark"
onButtonClick(value)
{
  console.log(value);
}*/
  constructor() { }

  ngOnInit(): void {
  }

}
