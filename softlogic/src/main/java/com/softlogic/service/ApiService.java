package com.softlogic.service;

import com.softlogic.model.Product;
import com.softlogic.model.ProductFilter;

import java.util.List;

public interface ApiService {
    List<Product> getProductList(List<ProductFilter> productFilter);
}