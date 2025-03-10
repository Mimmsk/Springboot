package com.example.springboot.repository;

import com.example.springboot.model.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Annotation to mark as Spring data repository
@Repository
public interface TableRepository extends JpaRepository<Table, Long> {
// Inherits CRUD for for Table entity
}