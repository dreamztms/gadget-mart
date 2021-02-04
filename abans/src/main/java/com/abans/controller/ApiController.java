package com.abans.controller;

import com.abans.model.Product;
import com.abans.model.ProductFilter;
import com.abans.service.ApiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/")
public class ApiController {

    @Autowired
    private ApiService apiService;

    @PostMapping("/get-product-list")
    public ResponseEntity<List<Product>> getProductList(@RequestBody List<ProductFilter> productFilter) {
        return new ResponseEntity<List<Product>>(apiService.getProductList(productFilter), HttpStatus.OK);

    }
}
