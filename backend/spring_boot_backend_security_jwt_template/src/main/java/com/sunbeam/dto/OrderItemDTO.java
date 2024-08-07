package com.sunbeam.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDTO {
    private Long id;
    private UserDTO user;
    private ProductDTO product;
    private int quantity;
    private LocalDate orderDate;
}
