package com.softlogic.repository;

import com.softlogic.model.Product;
import com.softlogic.model.ProductFilter;

import java.util.List;

public interface ApiRepository {
    List<Product> getProductList(List<ProductFilter> productFilter);
}
