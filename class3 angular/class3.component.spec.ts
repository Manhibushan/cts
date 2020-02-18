import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Class3Component } from './class3.component';

describe('Class3Component', () => {
  let component: Class3Component;
  let fixture: ComponentFixture<Class3Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Class3Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Class3Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
