package com.sunbeam.service;

import com.sunbeam.dto.CartDTO;
import com.sunbeam.entities.Cart;
import com.sunbeam.repository.CartRepository;
import com.sunbeam.exception.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public CartDTO getCartByUserId(Long userId) {
        Cart cart = cartRepository.findById(userId).orElseThrow(() -> new CustomException("Cart not found"));
        return new CartDTO(cart.getId(), null, null);
    }

    public CartDTO saveCart(CartDTO cartDTO) {
        Cart cart = new Cart(cartDTO.getId(), null, null);
        cart = cartRepository.save(cart);
        return new CartDTO(cart.getId(), null, null);
    }

    public void deleteCart(Long id) {
        cartRepository.deleteById(id);
    }
}
