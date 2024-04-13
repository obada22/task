package com.task.transactions.mapper;

import com.task.transactions.dto.PurchaseDto;
import com.task.transactions.entity.Purchase;
public class PurchaseMapper {



    public static PurchaseDto maptoPurchaseDto(Purchase purchase){
        return new PurchaseDto(
                purchase.getId(),
                purchase.getCustomer_id(),
                purchase.getProduct_id(),
                purchase.getAmount(),
                purchase.getDate()
        );
    }
    public static Purchase maptoProductDto(PurchaseDto purchaseDto){
        return new Purchase(
                purchaseDto.getId(),
                purchaseDto.getCustomer_id(),
                purchaseDto.getProduct_id(),
                purchaseDto.getAmount(),
                purchaseDto.getDate()
        );
    }

}
