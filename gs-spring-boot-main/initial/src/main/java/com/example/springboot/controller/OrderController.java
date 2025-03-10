package com.example.springboot.controller;

import com.example.springboot.model.Order;
import com.example.springboot.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// Annotation to mark as REST controller
@RestController
// Annotation to map endpoints to "/orders" path
@RequestMapping("/orders")
public class OrderController {

    // Autowired OrderService to handle business logic
    @Autowired
    private OrderService orderService;

    // Retrieves all orders
    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    //Retrieve order by ID
    @GetMapping("/id")
    public Optional<Order> getOrderById(@PathVariable Long id) {
        return orderService.getOrderById(id);
    }

    // Create order
    @PostMapping
    public Order createOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    // delete order by ID
    @DeleteMapping("/{id}")
    public void deleteOrder (@PathVariable Long id) {
        
    }

}