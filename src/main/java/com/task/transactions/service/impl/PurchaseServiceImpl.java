package com.task.transactions.service.impl;

import com.task.transactions.dto.PurchaseDto;
import com.task.transactions.entity.Purchase;
import com.task.transactions.mapper.PurchaseMapper;
import com.task.transactions.repository.PurchaseRepo;
import com.task.transactions.service.PurchaseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@AllArgsConstructor
public class PurchaseServiceImpl implements PurchaseService {
    private PurchaseRepo purchaseRepo;


    //create Purchase service
    @Override
    public PurchaseDto createPurchase(PurchaseDto purchaseDto) {
        Purchase purchase= PurchaseMapper.maptoPurchaseDto(purchaseDto);
        Purchase savePurchase=purchaseRepo.save(purchase);
        return PurchaseMapper.maptoPurchaseDto(savePurchase);
    }
}
