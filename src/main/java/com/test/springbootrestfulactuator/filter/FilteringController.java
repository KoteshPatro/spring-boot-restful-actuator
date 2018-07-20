package com.test.springbootrestfulactuator.filter;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {
	
	 
	@GetMapping(path="/filtering")
	public EmployeeBean retrieveEmployee(){
		return new EmployeeBean("kotesh","mohan","Mallik");
		
	}
	
	@GetMapping(path="/filtering-list")
	public List<EmployeeBean> retrieveListOfEmployee(){
		return Arrays.asList(new EmployeeBean("kotesh","mohan","Mallik"),new EmployeeBean("kotesh","mohan","Mallik"));
	}
	

}
