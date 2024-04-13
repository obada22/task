package com.task.transactions.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PurchaseDto {

    private Long id;
    private Long customer_id;
    private Long product_id;
    private Long amount;
    private Date date;

}
