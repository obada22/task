package com.task.transactions.mapper;

import com.task.transactions.dto.PurchaseDto;
import com.task.transactions.entity.Purchase;

public class PurchaseMapper {

    public static PurchaseDto maptoPurchaseDto(Purchase purchase){
        return new PurchaseDto(
                purchase.getId(),
                purchase.getCustomer(),
                purchase.getProduct(),
                purchase.getAmount()
                //,
               // purchase.getDate()
        );
    }



    public static Purchase maptoPurchaseDto(PurchaseDto purchaseDto){
        return new Purchase(
                purchaseDto.getId(),
                purchaseDto.getCustomer(),
                purchaseDto.getProduct(),
                purchaseDto.getAmount()//,
                //purchaseDto.getDate()
        );
    }

}
