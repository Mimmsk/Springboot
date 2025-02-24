package com.example.springboot.service;

import com.example.springboot.model.Table;
import com.example.springboot.repository.TableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TableService {

    @Autowired
    private TableRepository tableRepository;

    public List<Table> getAllTables() {
        return tableRepository.findAll();
    }

    public Optional<Table> getTableById(Long id) {
        return tableRespository.findById(id);
    }

    public Table addTable(Table table) {
        return tableRepository.save(table);
    }

    public Table updateTable(Long id, Table updatedTable) {
        return tableRepository.findById(id)
                .map(table -> {
                    table.setTableNumber(updatedTable.getTableNumber());
                    table.setCapacity(updatedTable.getCapacity());
                    return tableRepository.save(table);
                }).orElse(null);
    }

    public void deletTable(Long id) {
        tableRepository.deleteById(id);
    }

    
}
