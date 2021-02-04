package com.abans.repository;

import com.abans.model.Product;
import com.abans.model.ProductFilter;


import java.util.List;

public interface ApiRepository {
    List<Product> getProductList(List<ProductFilter> productFilter);
}
