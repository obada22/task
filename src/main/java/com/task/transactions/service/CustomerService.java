package com.task.transactions.service;
import com.task.transactions.dto.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface CumtomerService {
    CustomerDto createCustomer(CustomerDto customerDto);

    CustomerDto getCustomerById(Long customerId);

    List<CustomerDto> getAllCustomers();
}
