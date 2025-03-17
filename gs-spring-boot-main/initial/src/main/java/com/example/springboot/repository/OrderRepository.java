package com.example.springboot.repository;

import com.example.springboot.model.Order;

import org.springframework.stereotype.Repository;

//Annotation to mark as Spring data repository
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
// Inherits CRUD for for order entity    
}