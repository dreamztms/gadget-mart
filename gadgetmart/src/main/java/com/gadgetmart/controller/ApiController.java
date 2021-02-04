package com.gadgetmart.controller;


import com.gadgetmart.model.Order;
import com.gadgetmart.model.ProductFilter;
import com.gadgetmart.model.ProductList;
import com.gadgetmart.service.ApiService;
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
@RequestMapping(value = "/api")
public class ApiController {

    @Autowired
    private ApiService apiService;

    @PostMapping("/get-product-list")
    public ResponseEntity<ProductList> getProductList(@RequestBody List<ProductFilter> productFilter) throws IllegalAccessException {
        return new ResponseEntity<>(apiService.getProductList(productFilter), HttpStatus.OK);
    }

}
