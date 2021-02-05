import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({ providedIn: 'root' })
export class ApiService {
  baseURL: string = 'http://localhost:7042/';

  constructor(private http: HttpClient) {}

  getProductList(data) {
    const headers = {
      'content-type': 'application/json',
      'Access-Control-Allow-Origin': '*',
      'Access-Control-Allow-Methods': 'GET, POST, PATCH, PUT, DELETE, OPTIONS',
      'Access-Control-Allow-Headers': 'Origin, Content-Type, X-Auth-Token'
    };

    return this.http.post(this.baseURL + 'api/get-product-list', data, {
      headers: headers
    });
    // return this.handleResponse(
    //   this.http.post(this.baseURL + 'api/get-product-list', data, {
    //     headers: headers
    //   })
    // );
    // return this.http.post(this.baseURL + 'api/get-product-list', data)
    //   .map(res => this.handleResponse(res));
  }

  private handleResponse(res: any) {
    if (res.json().statusCode == 200) {
      return res.json().data;
    } else if (res.status == 200) {
      return res;
    } else if (res.json().statusCode == 204) {
      return {
        status: res.json().statusCode,
        message: res.json().message
      };
    } else if (res.status == 207) {
      throw Observable.throw(res.json());
    } else {
      return {
        status: res.json().statusCode,
        errors: res.json().additionalParams.body
      };
    }
  }
}
