package com.example.springboot.service;

import com.example.springboot.model.Table;
import com.example.springboot.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

// Annotation to mark this class as a Service component
@Service
public class TableService {

    // Autowire TableRepository to interact with database
    @Autowired
    private TableRepository tableRepository;

    public List<Table> getAllTables() {
        return tableRepository.findAll();
    }
    
    // Retrieve Table by ID
    public Optional<Table> getTableById(Long id) {
        return tableRespository.findById(id);
    }
    
    //Add table
    public Table addTable(Table table) {
        return tableRepository.save(table);
    }

    //Update Table
    public Table updateTable(Long id, Table updatedTable) {
        return tableRepository.findById(id)
                .map(table -> {
                    table.setTableNumber(updatedTable.getTableNumber());
                    table.setCapacity(updatedTable.getCapacity());
                    return tableRepository.save(table);
                }).orElse(null);
    }

    //Delete table
    public void deletTable(Long id) {
        tableRepository.deleteById(id);
    }

    
}
