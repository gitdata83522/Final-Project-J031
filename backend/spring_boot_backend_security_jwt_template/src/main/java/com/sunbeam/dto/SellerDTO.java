package com.sunbeam.dto;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SellerDTO {
    private Long id;
    private String name;
    private String email;
    private Set<ProductDTO> products;
}
