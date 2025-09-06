package com.example.demo1.entities;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping(value="html",method=RequestMethod.POST)
	public String firstApi() {
		return"html for hypertext mrkup languages";
	}

}
