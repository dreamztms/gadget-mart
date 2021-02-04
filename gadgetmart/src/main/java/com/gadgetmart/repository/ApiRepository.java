package com.gadgetmart.repository;

import com.gadgetmart.model.Order;
import com.gadgetmart.model.Product;
import com.gadgetmart.model.ProductFilter;

import java.util.List;

/**
 * @author thilinamullewidane
 */

public interface ApiRepository {
    List<Product> getProductList(List<ProductFilter> productFilter);

    List<Order> getOrderList(String type);
}
