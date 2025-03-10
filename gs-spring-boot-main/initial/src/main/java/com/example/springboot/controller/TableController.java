package com.example.springboot.controller;

import com.example.springboot.model.Table;
import com.example.springboot.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// Annotation to mark as REST controller
@RestController
// Annotation to map endpoints to "/tables" path
@RequestMapping("/tables")
public class TableController {

    // Autowired TableService to handle business logic
    @Autowired
    private TableService tableService;

    // Retrieves all tables
    @GetMapping
    public List<Table> getAllTables() {
        return tableService.getAllTables();
    }

    ////Retrieve table by ID
    @GetMapping("/{id}")
    public Optional<Table> getTableById(@PathVariable Long id) {
        return tableService.getTableById(id);
    }
    // add table
    @PostMapping
    public Table addTable(@RequestBody Table table) {
        return tableService.addTable(table);
    }

    // update table by ID
    @PutMapping("/{id}")
    public Table updateTable(@PathVariable Long id, @RequestBody Table table) {
        return tableService.updateTable(id, table);
    }

    // delete table by ID
    @DeleteMapping("/{id}")
    public void deleteTable(@PathVariable Long id) {
        tableService.deleteTable(id);
    }
    
}
