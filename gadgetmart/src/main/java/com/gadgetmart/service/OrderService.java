package com.gadgetmart.service;

import com.gadgetmart.model.Order;

import java.util.List;

/**
 * @author thilinamullewidane
 */
public interface OrderService {

    List<Order> getOrderList(String type,String userId);
}
