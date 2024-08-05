package com.sunbeam.entities;

import java.util.List;
import javax.persistence.*;
import lombok.*;

@Entity
@Table(name="seller")
@Getter
@Setter
@ToString
public class Seller extends BaseEntity {

    @Column(name="first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name="last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name="email", nullable = false, unique = true, length = 50)
    private String email;

    @Column(name="password", nullable = false, length = 50)
    private String password;

    @Column(name="phone_no", nullable = false, unique = true, length = 12)
    private String phoneNo;

    @OneToMany(mappedBy = "seller", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Product> products;
}
