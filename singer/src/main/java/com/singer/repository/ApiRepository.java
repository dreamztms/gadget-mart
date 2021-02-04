package com.singer.repository;

import com.singer.model.Product;
import com.singer.model.ProductFilter;

import java.util.List;

public interface ApiRepository {
    List<Product> getProductList(List<ProductFilter> productFilter);
}
