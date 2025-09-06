package com.tka.entities;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerUseRequestMapping {
	
	@RequestMapping(value="fetchdata" ,method=RequestMethod.GET)
	public String getMethodName() {
		return" Using get method --fetch data.";
	}
	
	
	@RequestMapping(value="adddata" ,method=RequestMethod.POST)
	public String postMethodName() {
		return" Using post method --submit and ADD data..";
	}
	
	@RequestMapping(value="updatedata" ,method=RequestMethod.PUT)
	public String putMethodName() {
		return" Using put method --Existing update data...";
	}
	
	@RequestMapping(value="deldata" ,method=RequestMethod.DELETE)
	public String deleteMethodName() {
		return" Using delete method --remove data....";
	}
	
	

}
