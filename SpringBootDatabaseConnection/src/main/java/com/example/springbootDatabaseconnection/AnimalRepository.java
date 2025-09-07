package com.example.springbootDatabaseconnection;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.entities.Animal;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
