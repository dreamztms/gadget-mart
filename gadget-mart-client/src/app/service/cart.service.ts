import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable()
export class CartService {
  cartItem = [];

  constructor() {
    // this.emptyCart();
    // this.updateCart(null);
  }

  updateCart(item) {
    let data = [];
    let cart = JSON.parse(localStorage.getItem('cart_item'));

    if (cart != null) {
      data = JSON.parse(localStorage.getItem('cart_item'));
    }

    if (item != null) {
      data.push(item);
    }

    localStorage.setItem('cart_item', JSON.stringify(data));
    this.cartItem = JSON.parse(localStorage.getItem('cart_item'));
    console.log(this.cartItem);
  }

  emptyCart() {
    localStorage.setItem('cart_item', null);
  }
}
