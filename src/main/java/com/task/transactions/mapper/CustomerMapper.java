package com.task.transactions.mapper;

import com.task.transactions.dto.CustomerDto;
import com.task.transactions.entity.Customer;

public class CustomerMapper {
    public static CustomerDto maptoCustomerDto(Customer customer){
        return new CustomerDto(
                customer.getId(),
                customer.getName(),
                customer.getPhone()
        );
    }

    public static Customer maptoCustomerDto(CustomerDto CustomerDto){
        return new Customer(
                CustomerDto.getId(),
                CustomerDto.getName(),
                CustomerDto.getPhone()
        );
    }

}