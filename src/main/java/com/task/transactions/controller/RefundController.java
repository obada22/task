package com.task.transactions.controller;
import com.task.transactions.dto.RefundDto;
import com.task.transactions.service.RefundService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/api/Refunds")
public class RefundController {


    private RefundService refundService;

    //Rest API buiLd add a refund
    @PostMapping
    public ResponseEntity<RefundDto> createRefund(@RequestBody RefundDto refundDto){
        RefundDto savedRefund= refundService.createRefund(refundDto);
        return new ResponseEntity<>(savedRefund, HttpStatus.CREATED);
    }
}