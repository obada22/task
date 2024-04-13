package com.task.transactions.service.impl;
import com.task.transactions.entity.Customer;
import com.task.transactions.exceptions.NotFoundException;
import com.task.transactions.mapper.CustomerMapper;
import com.task.transactions.repository.CustomerRepo;
import com.task.transactions.service.CustomerService;
import com.task.transactions.dto.CustomerDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepo customerRepo;
    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        Customer customer= CustomerMapper.maptoCustomerDto(customerDto);
       Customer saveCustomer = customerRepo.save(customer);
        return CustomerMapper.maptoCustomerDto(saveCustomer);
    }

    @Override
    public CustomerDto getCustomerById(Long customerId){
        Customer customer = customerRepo.findById(customerId)
                .orElseThrow(()
                -> new NotFoundException("resource Not Found"));
        return CustomerMapper.maptoCustomerDto(customer);
    }

    @Override
    public List<CustomerDto> getAllCustomers(){
        List<Customer> customers=customerRepo.findAll();
        return customers.stream().map(
                (customer) -> CustomerMapper.maptoCustomerDto(customer))
                .collect(Collectors.toList());
    }

    @Override
    public CustomerDto updateCustomer(Long customerId, CustomerDto updateCustomer) {
        Customer customer = customerRepo.findById(customerId).orElseThrow(
                ()-> new NotFoundException("not found:"+ customerId));

        customer.setName(updateCustomer.getName());
        customer.setPhone(updateCustomer.getPhone());
        Customer updateCustomerDto = customerRepo.save(customer);
        return CustomerMapper.maptoCustomerDto(updateCustomerDto);

    }

    @Override
    public void deleteCustomer(Long customerId) {
        Customer customer = customerRepo.findById(customerId).orElseThrow(
                ()-> new NotFoundException("not found:"+ customerId));
        customerRepo.deleteById(customerId);
    }


}
