package com.emp.service;

import com.emp.model.Customer;
import java.util.List;

public interface CustomerManager {
	
	/**
	 * Get customers List 
	 */
	public List<Customer> getAllCustomers();
	
	
	/**
	 * Get single customer record 
	 */
	public Customer getCustomers(int id);

	
	/**
	 * Add customer record
	 */
	public int createCustomers(Customer customer);
	
	
	/**
	 * Delete customer record
	 */	
	public void deleteCustomers(int id);
	
	/**
	 * Add customer record
	 */
	public void editCustomers(Customer customer);
}
