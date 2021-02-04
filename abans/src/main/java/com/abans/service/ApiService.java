package com.abans.service;



import com.abans.model.Product;
import com.abans.model.ProductFilter;

import java.util.List;

public interface ApiService {
    List<Product> getProductList(List<ProductFilter> productFilter);
}
