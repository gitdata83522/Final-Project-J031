package com.sunbeam.entities;

import java.util.List;
import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Customer extends BaseEntity {

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

    @Enumerated(EnumType.STRING)
    @Column(name="role")
    private Role role;

    public enum Role {
        SELLER, CUSTOMER
    }

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Address> addresses;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Order> orders;

    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    private Cart cart;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Review> reviews;
}
