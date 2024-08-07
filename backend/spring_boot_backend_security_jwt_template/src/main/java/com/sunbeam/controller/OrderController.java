package com.sunbeam.controller;

import com.sunbeam.dto.OrderItemDTO;
import com.sunbeam.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderItemService orderItemService;

    @GetMapping
    public List<OrderItemDTO> getAllOrders() {
        return orderItemService.getAllOrders();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderItemDTO> getOrderById(@PathVariable Long id) {
        return ResponseEntity.ok(orderItemService.getOrderById(id));
    }

    @PostMapping
    public ResponseEntity<OrderItemDTO> createOrder(@RequestBody OrderItemDTO orderItemDTO) {
        return ResponseEntity.ok(orderItemService.saveOrder(orderItemDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long id) {
        orderItemService.deleteOrder(id);
        return ResponseEntity.noContent().build();
    }
}
