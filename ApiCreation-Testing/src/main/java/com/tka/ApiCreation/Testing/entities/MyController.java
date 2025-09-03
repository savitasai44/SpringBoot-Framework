package com.tka.ApiCreation.Testing.entities;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping(value="apifirst",method=RequestMethod.GET)
	public String firstApi() {
		return"First Api Creating and testing..";
	}
	
	@RequestMapping(value="apisecond",method=RequestMethod.POST)
	public String secondApi() {
		return"second Api Creating and testing..";
	}
	
	@RequestMapping(value="apithird",method=RequestMethod.PUT)
	public String thirdApi() {
		return"Third Api Creating and testing..";
	}
	
	@RequestMapping(value="apifour",method=RequestMethod.DELETE)
	public String fourApi() {
		return"Four Api Creating and testin..";
	}
	
	@GetMapping
	public String getApi() {
		return"Fetch the data in using the getMapping Annotation Api Creating and testing..";
	}
	

	@PostMapping
	public String postApi() {
		return"Submit data in using the PostMapping Annotation Api Creating and testing..";
	}
	

	@PutMapping
	public String putApi() {
		return"Update the data in using the PutMapping Annotation Api Creating and testing..";
	}
	

	@DeleteMapping
	public String deleteApi() {
		return"delete the data in using the deleteMapping Annotation Api Creating and testing..";
	}
}
