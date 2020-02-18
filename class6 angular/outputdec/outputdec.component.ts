import { Component, OnInit, Output, EventEmitter } from '@angular/core';


@Component({
  selector: 'app-outputdec',
  templateUrl: './outputdec.component.html',
  styleUrls: ['./outputdec.component.css']
})
export class OutputdecComponent implements OnInit {



  @Output()
  public childEvent=new EventEmitter()
  
  onButtonClicked()
  {
    this.childEvent.emit("Data from child class")
  }
  constructor() { }

  ngOnInit(): void {
  }

}
