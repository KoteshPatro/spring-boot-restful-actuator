package com.test.springbootrestfulactuator.filter;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value={"field1","field2"})
public class EmployeeBean {
	
	private String field1;
	private String field2;
	
	//@JsonIgnore
	private String field3;
	
	
	
	
	public EmployeeBean(String field1, String field2, String field3) {
		super();
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}
	@Override
	public String toString() {
		return "EmployeeBean [field1=" + field1 + ", field2=" + field2 + ", field3=" + field3 + "]";
	}
	public String getField1() {
		return field1;
	}
	public String getField2() {
		return field2;
	}
	public String getField3() {
		return field3;
	}
	
	

}
