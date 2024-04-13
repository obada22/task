package com.task.transactions.entity;
import jakarta.persistence.*;
import lombok.*;
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

    @ManyToOne
  //  @JoinColumn(name="customer_id", referencedColumnName="customer_id")
    @Column(name="customer_id")
    private Long customer_id;

    @ManyToOne
  //  @JoinColumn(name="product_id", referencedColumnName="product_id")
    @Column(name="product_id")
    private Long product_id;

    @Column(name="amount")
    private Long amount;

    @Column(name="date")
    private Date date;

}
