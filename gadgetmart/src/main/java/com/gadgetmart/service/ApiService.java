package com.gadgetmart.service;

import com.gadgetmart.model.Order;
import com.gadgetmart.model.Product;
import com.gadgetmart.model.ProductFilter;
import com.gadgetmart.model.ProductList;

import java.util.List;

/**
 * @author thilinamullewidane
 */

public interface ApiService {
    ProductList getProductList(List<ProductFilter> productFilter) throws IllegalAccessException;

    List<Order> getOrderList(String type);
}
