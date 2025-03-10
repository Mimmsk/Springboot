package com.example.springboot.controller;

import com.example.springboot.model.Order;
import com.example.springboot.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// Annotation to mark as REST controller
@RestController
// Annotation to map endpoints to "/food" path
@RequestMapping("/food")
public class FoodController {

    // Autowired FoodService to handle business logic
    @Autowired
    private FoodService foodService;

    // Retrieves all food
    @GetMapping
    public List<Food> getAllFood() {
        return foodService.getAllFood();
    }

 
    //Retrieve food by ID
    @GetMapping("/{id}")
    public Optional<Food> getFoodById(@PathVariable Long id) {
        return foodService.getFoodById(id);
    }

    // add new food 
    @PostMapping
    public Food addFood(@RequestBody Food food) {
        return foodService.addFood(food);
    }

    // update food by ID
    @PutMapping("/{id}")
    public Food updateFood(@PathVariable Long id, @RequestBody Food updatedFood) {
        return foodService.updateFood(id, updatedFood);
    }

    // delete food item by ID
    @DeleteMapping("/{id}")
    public void deleteFood(@PathVariable Long id) {
        foodService.deleteFood(id);
    }
    
}
