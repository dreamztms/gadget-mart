package com.gadgetmart.controller;

import com.gadgetmart.model.Order;
import com.gadgetmart.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author thilinamullewidane
 */

@CrossOrigin
@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/get-order-list/{type}/{userId}")
    public ResponseEntity<List<Order>> getOrderList(@PathVariable String type,@PathVariable String userId) throws IllegalAccessException {
        return new ResponseEntity<>(orderService.getOrderList(type,userId), HttpStatus.OK);
    }

}
