package com.retail.ecomorderservice.controller;

import com.retail.ecomorderservice.service.OrderService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }
    @PostMapping("/{productId}")
    public String requestOrder(@PathVariable String productId){
        return orderService.placeOrder(productId);
    }
}
