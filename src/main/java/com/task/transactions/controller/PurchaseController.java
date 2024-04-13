package com.task.transactions.controller;

import com.task.transactions.dto.PurchaseDto;
import com.task.transactions.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/api/Purchases")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    //Rest API buiLd add a purchase
    @PostMapping
    public ResponseEntity<PurchaseDto> createPurchase(@RequestBody PurchaseDto purchaseDto){
        PurchaseDto savedPurchase= purchaseService.createPurchase(purchaseDto);
        return new ResponseEntity<>(savedPurchase, HttpStatus.CREATED);
    }
}
