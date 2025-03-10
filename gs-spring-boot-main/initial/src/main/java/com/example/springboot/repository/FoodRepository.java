package com.example.springboot.repository;

import com.example.springboot.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Annotation to mark as Spring data repository
@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
// Inherits CRUD for for food entity
}
