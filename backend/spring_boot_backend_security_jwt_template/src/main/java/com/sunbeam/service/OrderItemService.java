package com.sunbeam.service;

import com.sunbeam.dto.OrderItemDTO;
import com.sunbeam.entities.OrderItem;
import com.sunbeam.repository.OrderItemRepository;
import com.sunbeam.exception.CustomException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderItemService {
    @Autowired
    private OrderItemRepository orderItemRepository;

    public List<OrderItemDTO> getAllOrders() {
        return orderItemRepository.findAll().stream()
                .map(orderItem -> new OrderItemDTO(orderItem.getId(), null, null, orderItem.getQuantity(), orderItem.getOrderDate()))
                .collect(Collectors.toList());
    }

    public OrderItemDTO getOrderById(Long id) {
        OrderItem orderItem = orderItemRepository.findById(id).orElseThrow(() -> new CustomException("Order not found"));
        return new OrderItemDTO(orderItem.getId(), null, null, orderItem.getQuantity(), orderItem.getOrderDate());
    }

    public OrderItemDTO saveOrder(OrderItemDTO orderItemDTO) {
        OrderItem orderItem = new OrderItem(orderItemDTO.getId(), null, null, orderItemDTO.getQuantity(), orderItemDTO.getOrderDate());
        orderItem = orderItemRepository.save(orderItem);
        return new OrderItemDTO(orderItem.getId(), null, null, orderItem.getQuantity(), orderItem.getOrderDate());
    }

    public void deleteOrder(Long id) {
        orderItemRepository.deleteById(id);
    }
}
