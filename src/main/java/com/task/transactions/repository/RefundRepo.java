package com.task.transactions.repository;
import com.task.transactions.entity.Refund;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;
@RepositoryRestResource
public interface RefundRepo extends JpaRepository<Refund, Long>{
}
