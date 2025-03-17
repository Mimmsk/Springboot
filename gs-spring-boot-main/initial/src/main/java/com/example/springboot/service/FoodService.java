package com.example.springboot.service;

import com.example.springboot.model.Food;
import com.example.springboot.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Annotation to mark this class as a Service component
@Service
public class FoodService {

    // Autowire FoodRepository to interact with database
    @Autowired
    private FoodRepository foodRepository;

    // List food from database
    public List<Food> getAllFood() {
        return foodRepository.findAll();
    }

    // Retrieve food by ID
    public Optional<Food> getFoodById(Long id) {
        return foodRepository.findAllById(id);
    }
    // add new food type
    public Food addFood(Food food) {
        return foodRepository.save(food);
    }

    // Updates food type
    public Food updateFood(Long id, Food updatedFood) {
        return foodRepository.findAllById(id)
               .map(food -> {
                    food.setName(updatedFood.getName());
                    food.setPrice(updatedFood.getPrice());
                    return foodRepository.save(food);
               }).orElse(null);
    }
    
    // Delete food from database
    public void deleteFood(Long id) {
        foodRepository.deleteById(id);
    }
    
}
