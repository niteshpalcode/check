package com.eval.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eval.Exception.CustomerException;
import com.eval.model.Customer;
import com.eval.model.CustomerDTO;
import com.eval.service.CustomerService;

@RestController
public class CustomerController {

	
	@Autowired
	private CustomerService ci;
	
	
	
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> regidterEmployeeHandler(@RequestBody Customer c) throws CustomerException{
		Customer cus=ci.registerCustomer(c);
		
		return new ResponseEntity<Customer>(c,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/customer/{cid}")
	public ResponseEntity<Customer> getEmployeeByIdHandler(@PathVariable("cid") Integer cId) throws CustomerException{
		
		Customer empl =ci.getCustomerById(cId);
		return new ResponseEntity<Customer>(empl,HttpStatus.OK);
		
	}
	
	@GetMapping("/customers")
	public ResponseEntity<List<Customer>> allemp() throws CustomerException{
		
		List<Customer> empl =ci.getAllCustomerDetails();
		return new ResponseEntity<List<Customer>>(empl,HttpStatus.OK);
		
	}
	
	@GetMapping("/customer/{email}/{pass}")
	public ResponseEntity<Customer> valid(@PathVariable("email") String email,@PathVariable("pass") String password) throws CustomerException{
		
		Customer empl =ci.loginCustomer(email, password);
		
		return new ResponseEntity<Customer>(empl,HttpStatus.OK);
		
	}
	
	@GetMapping("/customers/{address}")
	public ResponseEntity<List<Customer>> byAddress(@PathVariable("address") String address) throws CustomerException{
		
		List<Customer> empl =ci.getCustomerDetailsByAddress(address);
		
		return new ResponseEntity<List<Customer>>(empl,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/customer/{cid}")
	public ResponseEntity<Customer> delet(@PathVariable("cid") Integer cId) throws CustomerException{
		
		Customer empl =ci.deleteCustomerById(cId);
		return new ResponseEntity<Customer>(empl,HttpStatus.OK);
		
	}
	
	@PutMapping("/customer")
	public ResponseEntity<Customer> update(@RequestBody Customer customer) throws CustomerException{
		
		Customer empl =ci.updateCustomer(customer);
		return new ResponseEntity<Customer>(empl,HttpStatus.ACCEPTED);
		
	}
	
	
	
	
//	@GetMapping("/customerdto")
//	
//	public ResponseEntity<List<CustomerDTO>> getall() throws CustomerException{
//		
//		List<CustomerDTO> empl =ci.getNameAddressAgeOfAllCustomers();
//		return new ResponseEntity<List<CustomerDTO>>(empl,HttpStatus.OK);
//		
//	}
	
	
	
}
