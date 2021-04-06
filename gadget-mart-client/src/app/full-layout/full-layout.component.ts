import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CartService } from '../service/cart.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './full-layout.component.html',
  styleUrls: ['./full-layout.component.scss']
})
export class FullLayoutComponent implements OnInit {
  showSlider = false;
  cartItem = [];
  constructor(public router: Router, public cartService: CartService) {
    if (this.router.url == '/') {
      this.showSlider = true;
    }
  }

  ngOnInit(): void {
    if (this.router.url == '/') {
      this.showSlider = true;
    }
  }

  checkout() {
    
  }
}
