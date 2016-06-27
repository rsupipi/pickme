package com.emp.model;

public class Customer {

	private int id;
	private String title;
	private String name;
	private String email;
	private String address;
	
	/**
	 * @param id
	 * @param title
	 * @param name
	 * @param email
	 * @param address
	 */
	public Customer(int id, String title, String name, String email,
			String address) {
		this.id = id;
		this.title = title;
		this.name = name;
		this.email = email;
		this.address = address;
	}

	public Customer(int id) {
		this.id = id;
	}

	/**
	 * 
	 */
	public Customer() {
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
}