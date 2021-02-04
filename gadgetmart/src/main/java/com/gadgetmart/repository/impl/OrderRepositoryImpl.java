package com.gadgetmart.repository.impl;

import com.gadgetmart.model.Order;
import com.gadgetmart.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

/**
 * @author thilinamullewidane
 */
@Repository
public class OrderRepositoryImpl implements OrderRepository {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public List<Order> getOrderList(String type,String userId) {

        StringBuilder orderList = new StringBuilder("select * from orders");

        return namedParameterJdbcTemplate.query(
                orderList.toString(),
                Collections.emptyMap(),
                (rs, i) -> {
                    Order order = new Order();
//                    product.setProductId(rs.getInt("PRODUCT_ID"));
                    return order;
                });
    }
}
