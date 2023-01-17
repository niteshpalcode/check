package com.eval.model;

import jakarta.persistence.Entity;


public class CustomerDTO {

	
	private String name;
	private String Address;
	private Integer age;
	
	
	
	public CustomerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public CustomerDTO(String name, String address, Integer age) {
		super();
		this.name = name;
		Address = address;
		this.age = age;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "CustomerDTO [name=" + name + ", Address=" + Address + ", age=" + age + "]";
	}
	
}
