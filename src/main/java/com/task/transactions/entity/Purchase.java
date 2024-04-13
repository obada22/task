package com.task.transactions.entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;


import java.time.LocalDate;
import java.util.Date;


@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "purchase")
public class Purchase {

    @Id
    @Column(name="purchase_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

 //   @ManyToOne
  //  @JoinColumn(name="customer_id", referencedColumnName="customer_id")
    @Column(name="customer")
    private String customer;

 //   @ManyToOne
  //  @JoinColumn(name="product_id", referencedColumnName="product_id")
    @Column(name="product")
    private String product;

    @Column(name="amount")
    private Long amount;
/*
    @JsonFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name="date")
    private LocalDate date;*/

}
