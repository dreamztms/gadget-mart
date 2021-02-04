package com.gadgetmart.repository;

import com.gadgetmart.model.Order;

import java.util.List;

/**
 * @author thilinamullewidane
 */
public interface OrderRepository {

    List<Order> getOrderList(String type,String userId);
}
