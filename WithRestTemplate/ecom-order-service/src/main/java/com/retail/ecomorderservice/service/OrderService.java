package com.retail.ecomorderservice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
    private final RestTemplate restTemplate;

    public OrderService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String placeOrder(String productId){

        return restTemplate.getForObject("http://localhost:8081/inventory/" +productId,
                String.class);
        
    }
}
