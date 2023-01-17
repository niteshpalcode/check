package com.eval.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.eval.Exception.CustomerException;
import com.eval.model.Customer;
import com.eval.model.CustomerDTO;
import com.eval.repo.CustomerRepo;



@Service
public class CustomerServiceImpl implements CustomerService{

	
	@Autowired
	private CustomerRepo cr;

	@Override
	public Customer registerCustomer(Customer customer) throws CustomerException {
		// TODO Auto-generated method stub
		Customer c=cr.save(customer);
		return c;
	}

	@Override
	public Customer getCustomerById(Integer customerId) throws CustomerException {
		// TODO Auto-generated method stub
		Optional<Customer> c=cr.findById(customerId);
		return c.orElseThrow(()-> new CustomerException("does not found ...."));
	}

	@Override
	public Customer loginCustomer(String email, String password) throws CustomerException {
		// TODO Auto-generated method stub
		Customer cus=cr.findByEmail(email, password);
		if(cus==null) {
			throw new CustomerException("Wrong");
		}else {
			return cus;
			
		}	
	}

	@Override
	public List<Customer> getAllCustomerDetails() throws CustomerException {
		// TODO Auto-generated method stub
		List<Customer>lc=cr.findAll();
		if(lc!=null) {
			return lc;
		}
		else {
			throw new CustomerException("No customer");
		}
	}

	@Override
	public Customer deleteCustomerById(Integer customerId) throws CustomerException {
		// TODO Auto-generated method stub
		 Optional<Customer> opt = cr.findById(customerId);
			
			if(opt.isPresent()) {
				Customer c = opt.get();
				cr.delete(c);
				return c;
			}else {
				throw new CustomerException("cus id not found...");
			} 
	}

	@Override
	public List<Customer> getCustomerDetailsByAddress(String address) throws CustomerException {
		// TODO Auto-generated method stub
		List<Customer> lc=cr.findByAddress(address);
		if(lc!=null) {
			return lc;
		}else {
			throw new CustomerException("Nothing");
		}
//		return null;
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerException {
		// TODO Auto-generated method stub
		Optional<Customer>opt=cr.findById(customer.getcId());
		if(opt.isPresent()) {
			Customer update=cr.save(customer);
			return update;
		}
		else {
			throw new CustomerException("No updated");
		}
	}

	@Override
	public List<Customer> getCustomersBetweenAge(Integer start_age, Integer end_age) throws CustomerException {
		// TODO Auto-generated method stub
		List<Customer> list=cr.findByAgeBetween(start_age, end_age);
		if(list.isEmpty()) {
			throw new CustomerException("Invalid");
		}else {
			return list; 
		}
//		return null;
	}

	@Override
	public List<CustomerDTO> getNameAddressAgeOfAllCustomers() throws CustomerException {
		// TODO Auto-generated method stub
		List<CustomerDTO> list=cr.getNameAddressAgeOfAllCustomer();
		if(list.isEmpty()) {
			throw new CustomerException("No such");
			
		}
		else {
			return list;
		}
	}
	
	
	
	
}
