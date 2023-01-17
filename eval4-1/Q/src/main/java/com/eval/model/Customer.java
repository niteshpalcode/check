package com.eval.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private	Integer cId; 
	@NotNull
	@Size(min=3,max =10	,message = "length should be 3 to 10")
	private	String name;
	@NotNull
	@Min(18)
	private Integer age;
	@NotNull
	@Size(min=3,max =15	,message = "length should be 3 to 15")
	private	String Address; 
	@NotNull
	@Email(message = "Not valid")
	private	String email;
	@NotNull
	@Size(min=10,max =10	,message = "length should be 10")
	private	String mobile;
	@NotNull
	@Size(min=8,max =15	,message = "length should be 8 to 15")
	private String password;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(Integer cId, @NotNull @Size(min = 3, max = 10, message = "length should be 3 to 10") String cName,
			@NotNull @Min(18) Integer age,
			@NotNull @Size(min = 3, max = 15, message = "length should be 3 to 15") String address,
			@NotNull @Email(message = "Not valid") String email,
			@NotNull @Size(min = 10, max = 10, message = "length should be 10") String mobile,
			@NotNull @Size(min = 8, max = 15, message = "length should be 8 to 15") String password) {
		super();
		this.cId = cId;
		this.name = cName;
		this.age = age;
		Address = address;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public String getcName() {
		return name;
	}
	public void setcName(String cName) {
		this.name = cName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + name + ", age=" + age + ", Address=" + Address + ", email="
				+ email + ", mobile=" + mobile + ", password=" + password + "]";
	}
	
	
}
