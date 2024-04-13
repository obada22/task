package com.task.transactions.service.impl;

import com.task.transactions.dto.RefundDto;
import com.task.transactions.entity.Refund;
import com.task.transactions.mapper.RefundMapper;
import com.task.transactions.repository.RefundRepo;
import com.task.transactions.service.RefundService;

public class RefundServiceImpl implements RefundService {

    private RefundRepo refundRepo;

    //create Refund service
    @Override
    public RefundDto createRefund(RefundDto refundDto) {
        Refund refund= RefundMapper.maptoRefundDto(refundDto);
        Refund saveRefund=refundRepo.save(refund);
        return RefundMapper.maptoRefundDto(saveRefund);

    }
}
