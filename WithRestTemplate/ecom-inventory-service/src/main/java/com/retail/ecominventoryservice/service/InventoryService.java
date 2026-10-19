package com.retail.ecominventoryservice.service;

import org.springframework.stereotype.Service;

@Service
public class InventoryService {
    public String inventoryService (String productId){
        return productId.equalsIgnoreCase("1234") ? productId+" IN STOCK" :
                productId +" NOT IN STOCK";
    }
}
