package com.sunbeam.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Product")
@Getter
@Setter
@ToString
public class Product extends BaseEntity {
	 @Column(name="product_name", nullable = false, length = 50)
	    private String name;

	    @Column(name="product_price", nullable = false)
	    private double price;

	    @Column(name="product_quantity", nullable = false)
	    private int quantity;

	    @Column(name="description", nullable = false)
	    private String description;

	    @ManyToOne
	    @JoinColumn(name = "seller_id", nullable = false)
	    private Seller seller;

	    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	    private List<Review> reviews;

	    @ManyToMany(mappedBy = "products")
	    private List<Order> orders;
	
}
