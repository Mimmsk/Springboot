package com.example.springboot.model;

import org.springframework.data.annotation.Id;

//Annotation to mark this class as a JPA entity
@Entity
// Annotation to specify the table name in database
@Table(name = "tables" )
public class Table {
    // Annotation to mark this field as primary key
    @Id 
    // Annotation to specify that ID is auto-generated
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
