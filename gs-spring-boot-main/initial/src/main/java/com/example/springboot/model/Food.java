package com.example.springboot.model;

import javax.annotation.processing.Generated;

-Type;;

//Annotation to mark this class as a JPA entity
@Entity
// Annotation to specify the table name in database
@Table(name = "food")
public class Food {
    // Annotation to mark this field as primary key
    @Id
    // Annotation to specify that ID is auto-generated
    @Generated(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;

    //getters and setters
    public Long getId() {return id; }
    public void  setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
