package com.retail.ecominventoryservice.controller;

import com.retail.ecominventoryservice.service.InventoryService;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/inventory")
public class InventoryController {

    private final InventoryService inventorySvc;

    public InventoryController(InventoryService inventorySvc) {
        this.inventorySvc = inventorySvc;
    }

    @GetMapping("/{productId}")
    public String inventoryController(@PathVariable String productId){
        return inventorySvc.inventoryService(productId);
    }
}
