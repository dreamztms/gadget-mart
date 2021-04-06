import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SeeCartComponent } from './see-cart.component';

describe('SeeCartComponent', () => {
  let component: SeeCartComponent;
  let fixture: ComponentFixture<SeeCartComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SeeCartComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SeeCartComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
