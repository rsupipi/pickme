package com.emp.dao;

import java.util.List;
import com.emp.model.Customer;;

/**
 *
 * @author rsupipi
 */
public interface CustomerDAO {

	/**
	 * Add customer to database
	 */
	public int Addcustomer(Customer customer);

	/**
	 * Get Customer list from the database
	 */
	public List<Customer> getCustomerList();

	/**
	 * Get Customer details from the database
	 */
	public Customer getCustomer(int id);

	/**
	 * Delete customer from the database
	 */
	public void deleteCustomer(int id);

	/**
	 * Edit customer from the database
	 */

	public void deleteCustomerRecord(int id);

	/**
	 * Edit customer from the database
	 */

	public void editCustomer(Customer customer);

}
