package com.tka.entities;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController	                  			
//@RequestMapping("/student")
public class Student {
	
	//@GetMapping("/id")    ..fetch data
	@RequestMapping(value="/get" ,method=RequestMethod.GET)
	public String firstApi() {
		return "Frontend technology API is HTML,CSS,JS "
				+"and framework is Angular";
	}
	
    //@PostMapping("/save") ...submit add data
	@RequestMapping(value="/post" ,method=RequestMethod.POST)
    public String secondApi() {
		return"Backend technology API is JDBC,Servlet,Jsp"
				+ "and Framework like Hibernate ,Spring ,SpringBoot";
	}
	
	//@PutMapping("/update")          update data
	@RequestMapping(value="/put" ,method=RequestMethod.PUT)
       public String thridApi() {
		return"sql languages....";
	}
	
	//@DeleteMapping("/id")            delete data
	@RequestMapping(value="/delete" ,method=RequestMethod.DELETE)
	public String fourApi() {
		return "java developer ==Core Java + Advance Java";
	}

	
}
