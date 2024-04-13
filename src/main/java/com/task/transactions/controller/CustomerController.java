package com.task.transactions.controller;
import com.task.transactions.dto.CustomerDto;
import com.task.transactions.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(path = "/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    //Rest API buiLd add a customer
    @PostMapping
    public ResponseEntity <CustomerDto> createCustomer(@RequestBody CustomerDto customerDto){
        CustomerDto savedCustomer= customerService.createCustomer(customerDto);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }

    //Rest API buiLd Get a customer
    @GetMapping(path = "{id}")
    public ResponseEntity <CustomerDto> getCustomerById(@PathVariable("id") Long customerId){
        CustomerDto customerDto = customerService.getCustomerById(customerId);
        return ResponseEntity.ok(customerDto);
    }

    //Rest API buiLd Get all customers
    @GetMapping
    public ResponseEntity<List<CustomerDto>>getAllCustomers(){
        List<CustomerDto> customers  = customerService.getAllCustomers();
        return ResponseEntity.ok(customers);
    }


    //Rest API buiLd update customer
    @PutMapping("{id}")
    public ResponseEntity<CustomerDto> updateCustomer(@PathVariable("id") Long customerId,
                                                      @RequestBody CustomerDto updateCustomer){
        CustomerDto customerDto=customerService.updateCustomer(customerId, updateCustomer);
        return ResponseEntity.ok(customerDto);
    }

    //Rest API buiLd delete customer
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("id") Long customerId){
        customerService.deleteCustomer(customerId);
        return ResponseEntity.ok("Customer Deleted Successfully..");
    }

}
