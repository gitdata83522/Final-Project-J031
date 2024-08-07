package com.sunbeam.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDTO {
    private Long id;
    private ProductDTO product;
    private UserDTO user;
    private int rating;
    private String comment;
}
