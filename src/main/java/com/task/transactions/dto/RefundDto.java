package com.task.transactions.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RefundDto {

        private Long id;
        private Long customer_id;
        private Long product_id;
        private Long purchase_id;
        private Long amount;

}
