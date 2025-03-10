package  com.example.springboot.service;

import com.example.springboot.model.Order;
import com.example.springboot.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Annotation to mark this class as a Service component 
@Service
public class OrderService {

    // Autowire OrderRepository to interact with database
    @Autowired
    private OrderRepository orderRepository;

    // Retrieve all orders from database
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
    
    // Retrieve order by ID
    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }
    
    // Save new order/ updates existing one
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    //Delete order by ID
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}