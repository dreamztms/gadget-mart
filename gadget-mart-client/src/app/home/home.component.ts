import { Component, OnInit } from '@angular/core';
import { ApiService } from '../service/api.service';

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

  constructor(private apiService: ApiService) {}

  ngOnInit(): void {
    this.getProductList();
  }

  getProductList() {
    let data = [
      {
        type: 'all'
      }
    ];
    this.apiService.getProductList(data).subscribe(data => {
      if (data) {
        this.productList = JSON.parse(JSON.stringify(data));
        console.log(this.productList);
        this.abansProductList = this.productList.abansProductList;
        this.softlogicProductList = this.productList.softlogicProductList;
        this.singerProductList = this.productList.singerProductList;
      }
    });
  }
}
