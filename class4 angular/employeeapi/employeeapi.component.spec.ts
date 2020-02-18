import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeapiComponent } from './employeeapi.component';

describe('EmployeeapiComponent', () => {
  let component: EmployeeapiComponent;
  let fixture: ComponentFixture<EmployeeapiComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeeapiComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeapiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
