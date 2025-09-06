package com.tka.entities;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@RequestMapping("/usemethod")
public class ControllerUseGetPostPutDeleteMapping {
	
	@GetMapping("/fetchdata")    //GetMapping annotation used to FETCH the data
	public String getUser() {
		return"Fetching the data ";
	}
	
	@PostMapping("/adddata")     
	public String postMethodName() {
		return "Add user";
	}
	
	@PutMapping("/updatedata")
	public String putMethodName() {
		return "update the data";
	}
	
	
	@DeleteMapping("/removedata")
	public String deleteMethodName() {
		return " deleted  the data";
	}
	
}
