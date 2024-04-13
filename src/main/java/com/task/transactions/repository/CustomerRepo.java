package com.task.transactions.repo;

import com.task.transactions.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



@RepositoryRestResource
public interface CustomerRepo extends JpaRepository<Customers, Long> {


}