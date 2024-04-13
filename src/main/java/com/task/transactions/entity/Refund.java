package com.task.transactions.entity;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "refund")
public class Refund {

        @Id
        @Column(name="refund_id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        //   @ManyToOne
        //  @JoinColumn(name="customer_id", referencedColumnName="customer_id")
        @Column(name="customer_id")
        private Long customer_id;

        //   @ManyToOne
        //  @JoinColumn(name="product_id", referencedColumnName="product_id")
        @Column(name="product_id")
        private Long product_id;

        //   @ManyToOne
        //  @JoinColumn(name="purchase_id", referencedColumnName="purchase_id")
        @Column(name="purchase_id")
        private Long purchase_id;

        @Column(name="amount")
        private Long amount;

}


