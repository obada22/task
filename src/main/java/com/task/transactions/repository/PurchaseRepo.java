package com.task.transactions.repository;

import com.task.transactions.entity.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PurchaseRepo extends JpaRepository<Purchase, Long> {

}
