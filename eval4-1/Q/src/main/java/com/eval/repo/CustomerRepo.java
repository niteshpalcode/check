package com.eval.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.eval.model.Customer;
import com.eval.model.CustomerDTO;
@Repository
public interface CustomerRepo  extends JpaRepository<Customer, Integer>{
	
	@Query("select s from Customer s where s.Address = ?1")
	public List<Customer> findByAddress(String address);
	
	@Query("select c from Customer AS c where c.email=?1 AND c.password=?2")
	public Customer findByEmail(String email,String password);
	
//	@Query("select e from Customer e where e.age BETWEEN e.age=?1 AND e.age=?2 ")
//	@Query("select c from Customer as c where c.age BETWEEN c.age=?1 AND c.age=?2")
	public List<Customer> findByAgeBetween(Integer age1,Integer age2);
	
	@Query("select new com.eval.model.CustomerDTO(c.Address,c.age,c.name) from Customer as c")
	public List<CustomerDTO> getNameAddressAgeOfAllCustomer();
	
}
