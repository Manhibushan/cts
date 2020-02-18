import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { OutputdecComponent } from './outputdec.component';

describe('OutputdecComponent', () => {
  let component: OutputdecComponent;
  let fixture: ComponentFixture<OutputdecComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ OutputdecComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(OutputdecComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
