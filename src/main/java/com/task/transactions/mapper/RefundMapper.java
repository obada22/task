package com.task.transactions.mapper;
import com.task.transactions.entity.Refund;
import com.task.transactions.dto.RefundDto;
public class RefundMapper {


    public static RefundDto maptoRefundDto(Refund refund) {
        return new RefundDto(
                refund.getId(),
                refund.getCustomer_id(),
                refund.getProduct_id(),
                refund.getPurchase_id(),
                refund.getAmount()

        );
    }
        public static Refund maptoRefundDto(RefundDto refundDto){
            return new Refund(
                    refundDto.getId(),
                    refundDto.getCustomer_id(),
                    refundDto.getProduct_id(),
                    refundDto.getPurchase_id(),
                    refundDto.getAmount()
            );
        }

}


