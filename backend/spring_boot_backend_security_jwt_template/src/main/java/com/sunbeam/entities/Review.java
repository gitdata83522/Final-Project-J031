package com.sunbeam.entities;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="review")
@Getter
@Setter
public class Review extends BaseEntity {

    @Column(name="comment", nullable = false, length = 50)
    private String comment;

    @Column(name="rating", nullable = false)
    private int rating;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
}
