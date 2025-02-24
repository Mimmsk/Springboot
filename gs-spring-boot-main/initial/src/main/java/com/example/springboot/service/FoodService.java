package com.example.springboot.service;

import com.example.springboot.model.Food;
import com.example.springboot.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List<Food> getAllFood() {
        return foodRepository.findAll();
    }

    public Optional<Food> getFoodById(Long id) {
        return foodRepository.findById(id);
    }

    public Food addFood(Food food) {
        return foodRepository.save(food);
    }

    public Food updateFood(Long id, Food updatedFood) {
        return foodRepository.findById(id)
               .map(food -> {
                    food.setName(updatedFood.getName());
                    food.setPrice(updatedFood.getPrice());
                    return foodRepository.save(food);
               }).orElse(null);
    }

    public void deleteFood(Long id) {
        foodRepository.deleteById(id);
    }
    
}
