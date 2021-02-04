package com.softlogic.controller;

import com.softlogic.model.Product;
import com.softlogic.model.ProductFilter;
import com.softlogic.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @author thilinamullewidane
 */

@CrossOrigin
@RestController
@RequestMapping(value = "/")
public class ApiController {

    @Autowired
    private ApiService apiService;

    @PostMapping("/get-product-list")
    public ResponseEntity<List<Product>> getProductList(@RequestBody List<ProductFilter> productFilter) {
        return new ResponseEntity<>(apiService.getProductList(productFilter), HttpStatus.OK);

    }
}
