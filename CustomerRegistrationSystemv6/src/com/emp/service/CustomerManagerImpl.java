package com.emp.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.dao.CustomerDAO;
import com.emp.model.Customer;


@Service("customerManager")
public class CustomerManagerImpl implements CustomerManager {
	static Logger LOG = Logger.getLogger(CustomerDAO.class.getName());
	

	@Autowired
	private CustomerDAO customerDAO;

	
	/**
	 * Delete customer record
	 */	
	@Override
	public void deleteCustomers(int id) {
		customerDAO.deleteCustomerRecord(id);		
	}

	
	/**
	 * Get customers List 
	 */
	@Override
	public List<Customer> getAllCustomers() {		
		return customerDAO.getCustomerList();
	}

	
	/**
	 * Add customer record
	 */
	@Override
	public int createCustomers(Customer customer) {
		return customerDAO.Addcustomer(customer);
		

	}

	
	/**
	 * Add customer record
	 */
	@Override
	public void editCustomers(Customer customer) {
			customerDAO.editCustomer(customer);
		
	}

	@Override
	public Customer getCustomers(int id) {		
		return customerDAO.getCustomer(id);
	}

}