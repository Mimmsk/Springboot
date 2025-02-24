package com.example.springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tables" )
public class Table {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int tableNumber;
    private int capacity;

    //getters and setters
    public Long getId() { return id; }
    public void setId(Longid) { this.id; }

    public int getTableNumber() { return tableNumber; }
    public void setTableNumber(int tableNumber) { this.tableNumber = tableNumber; }

    public int getBapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    
}
