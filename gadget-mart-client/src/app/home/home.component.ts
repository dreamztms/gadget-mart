import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { ApiService } from '../service/api.service';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';
import { CartService } from '../service/cart.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {
  productList: any = [];
  abansProductList = [];
  softlogicProductList = [];
  singerProductList = [];
  allProducts = [];
  @Output() updateCart = new EventEmitter<string>();

  constructor(
    private apiService: ApiService,
    private route: ActivatedRoute,
    private router: Router,
    private cartService: CartService
  ) {}

  ngOnInit(): void {
    this.getProductList();
  }

  getProductList() {
    this.allProducts = [];
    let data = [
      {
        type: 'all'
      }
    ];
    this.apiService.getProductList(data).subscribe(data => {
      if (data) {
        this.productList = JSON.parse(JSON.stringify(data));
        this.abansProductList = this.productList.abansProductList;
        this.softlogicProductList = this.productList.softlogicProductList;
        this.singerProductList = this.productList.singerProductList;

        this.abansProductList.forEach(element => {
          this.allProducts.push(element);
        });

        this.softlogicProductList.forEach(element => {
          this.allProducts.push(element);
        });

        this.singerProductList.forEach(element => {
          this.allProducts.push(element);
        });
      }
    });
  }

  addToCart(item) {
    
    this.cartService.updateCart(item);
    // this.router.navigate(['/about-us']);
  }
}
