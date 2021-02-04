package com.singer.service;

import com.singer.model.Product;
import com.singer.model.ProductFilter;


import java.util.List;

/**
 * @author thilinamullewidane
 */

public interface ApiService {
    List<Product> getProductList(List<ProductFilter> productFilter);
}
