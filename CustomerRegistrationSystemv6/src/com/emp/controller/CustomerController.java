
package com.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.emp.model.Customer;
import com.emp.service.CustomerManager;



@Controller
//@RequestMapping("/employee-module")
public class CustomerController {
	
	@Autowired
	private CustomerManager customerManager;

	// ===== CURD Operations ====================================================
	
	// ======add ================================================================

	/** Add employee Data Form */
	@RequestMapping(value = {"/add","/edit/add"}, method = RequestMethod.GET)
	public String add(ModelMap model) {
		model.addAttribute("message", "Add Customer");
		model.addAttribute("customer", new Customer());
		return "addCustomer";
	}

	/** add customer data to data base and create a new customer */
	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	public String addCustomer(@ModelAttribute("customer") Customer customer, BindingResult result, ModelMap model) {
		int customerId = 0;

		customerId  = customerManager.createCustomers(customer);
	
		model.addAttribute("id", customerId);
		model.addAttribute("title", customer.getTitle());
		model.addAttribute("name", customer.getName());
		model.addAttribute("email", customer.getEmail());
		model.addAttribute("address", customer.getAddress());
		model.addAttribute("message", "Successfully added");
		
		model.addAttribute("button1", "<a href='view' class='btn btn-info'>View All Customers</a>");
		model.addAttribute("button2", "<a href='add' class='btn btn-success' >Add Customer</a>");

		return "success";
	}
	
	//=======edit =============================================================
	/** Goto Update Customer form */
	
	@RequestMapping(value = "/edit{id}", method = RequestMethod.GET)
	public String editCustomer(@PathVariable("id") int id, ModelMap model) {

		model.addAttribute("customer", new Customer());
		Customer customer = customerManager.getCustomers(id);
		model.addAttribute("id", customer.getId());
		model.addAttribute("title",	customer.getTitle()); 
		model.addAttribute("name",customer.getName());
		model.addAttribute("email", customer.getEmail());		
        model.addAttribute("address", customer.getAddress());
		
		
		return "editCustomer";
	}

	/** edit customer in dataBases Update Customer */
	
	@RequestMapping(value = "/editcustomer", method = RequestMethod.POST)
	public String editCustomer(@ModelAttribute("customer") Customer customer, BindingResult result, ModelMap model) {
	
		customerManager.editCustomers(customer);
		model.addAttribute("id",customer.getId());
		model.addAttribute("title", customer.getTitle());
		model.addAttribute("name", customer.getName());
		model.addAttribute("email", customer.getEmail());
		model.addAttribute("address", customer.getAddress());
		model.addAttribute("message", "Successfully Edited");
		
		model.addAttribute("button1", "<a href='view' class='btn btn-info'>OK</a>");
		model.addAttribute("button2", "<a href='add' class='btn btn-success' >Add Customer</a>");
	
		/*model.addAttribute("button1", "<a href='add' class='btn btn-info'>OK</a>");
		model.addAttribute("button2", "<a href='edit${id}' class='btn btn-success' >Add Customer</a>");
		*/
		return "success";
	}

	/** Read all users */
	@RequestMapping(value ={"/view"}, method = RequestMethod.GET)
	public String getAllCustomer(Model model) {
		model.addAttribute("customers", customerManager.getAllCustomers());
		return "viewCustomer";
	}

	/** Read single users */
	@RequestMapping(value = "/read{id}", method = RequestMethod.GET)
	public String getCustomer(Model model) {
		model.addAttribute("customers", customerManager.getAllCustomers());
		return "viewCustomer";
	}

	/** Delete employee */
	@RequestMapping(value = "/delete{id}", method = RequestMethod.GET)
	public String deleteCustomer(@PathVariable("id") int id, @ModelAttribute Customer customer, ModelMap model) {
		
		Customer customerExist = customerManager.getCustomers(id);	
		model.addAttribute("id", id);
		model.addAttribute("title", customerExist.getTitle());
		model.addAttribute("name", customerExist.getName());
		model.addAttribute("email", customerExist.getEmail());
		model.addAttribute("address", customerExist.getAddress());
		model.addAttribute("message", "Successfully Deleted");
		
		model.addAttribute("button1", "<a href='view' class='btn btn-info'>OK</a>");
		model.addAttribute("button2", "<a href='add' class='btn btn-success' >Add Customer</a>");
		
		customerManager.deleteCustomers(id);
		return "success";
	}

	// ===== Page navigations ===========================================

	/* get Success page */

	/* Goto home page */
	@RequestMapping(value = "/t", method = RequestMethod.GET)
	public String gototest1(ModelMap model) {
		return "test";
	}

	/* Goto home page */
	@RequestMapping(value = "/aa", method = RequestMethod.GET)
	public String gotot(ModelMap model) {
		return "success";
	}

	/* Goto home page */
	@RequestMapping(value = "/homepage", method = RequestMethod.GET)
	public String gotoHome(ModelMap model) {
		return "homePage"; // homePage.jsp
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	@Autowired
	EmployeeManager manager;
	
	@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	public String getAllEmployees(Model model) {
		model.addAttribute("employees", manager.getAllEmployees());
		return "employeesListDisplay";
		
	}
	*/
}
