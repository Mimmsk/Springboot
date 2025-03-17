package com.example.springboot.model;

import javax.persistence.Entity;




//Annotation to mark this class as a JPA entity
@Entity
// Annotation to specify the table name in database
@Table(name = "orders")
public class Order {
    // Annotation to mark this field as primary key
    @Id
    // Annotation to specify that ID is auto-generated
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Annotations to specify columns cannot contain null values
    @Column(nullable = false)
    private String productName;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private double price;

    // Constructor creates order with given values
    public Order() {}
    
    public Order(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public doable getPrice() { return price; }
    public void setPrice(doable price) { this.price = price; }
}