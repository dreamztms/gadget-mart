package com.gadgetmart.service.impl;

import com.gadgetmart.model.Order;
import com.gadgetmart.repository.OrderRepository;
import com.gadgetmart.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author thilinamullewidane
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getOrderList(String type,String userId) {
        return orderRepository.getOrderList(type,userId);
    }
}
