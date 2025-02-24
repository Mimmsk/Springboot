package com.example.springboot.controller;

import com.example.springboot.model.Table;
import com.example.springboot.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tables")
public class TableController {

    @Autowired
    private TableService tableService;

    @GetMapping
    public List<Table> getAllTables() {
        return tableService.getAllTables();
    }

    @GetMapping("/{id}")
    public Optional<Table> getTableById(@PathVariable Long id) {
        return tableService.getTableById(id);
    }

    @PostMapping
    public Table addTable(@RequestBody Table table) {
        return tableService.addTable(table);
    }

    @PutMapping("/{id}")
    public Table updateTable(@PathVariable Long id, @RequestBody Table table) {
        return tableService.updateTable(id, table);
    }

    @DeleteMapping("/{id}")
    public void deleteTable(@PathVariable Long id) {
        tableService.deleteTable(id);
    }
    
}
