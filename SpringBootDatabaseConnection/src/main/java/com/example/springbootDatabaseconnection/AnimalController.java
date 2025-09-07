package com.example.springbootDatabaseconnection;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.entities.Animal;

@RestController
//@RequestMapping("/animal")
public class AnimalController {

	private AnimalRepository repo;

	public AnimalController(AnimalRepository repo) {
		this.repo=repo;
	}
	
	
	  // Get all students
    @GetMapping
    public List<Animal> getAll() {
        return repo.findAll();
    }
	
	
	//Post a new Student
	@PostMapping("/createdata")
	public Animal createAnimal(@RequestBody Animal ani) {
		return repo.save(ani);
	}
}
