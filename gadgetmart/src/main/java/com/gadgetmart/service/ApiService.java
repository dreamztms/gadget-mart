package com.gadgetmart.service;

import com.gadgetmart.model.Product;
import com.gadgetmart.model.ProductFilter;

import java.util.List;

public interface ApiService {
    List<Product> getProductList(List<ProductFilter> productFilter);
}
