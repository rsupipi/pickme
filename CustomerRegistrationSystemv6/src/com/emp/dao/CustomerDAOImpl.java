package com.emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import java.util.ArrayList;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import com.emp.model.Customer;

import database.DataBaseConnection;
import database.IdGenerator;

/**
 *
 * @author rsupipi
 */
@Repository
public class CustomerDAOImpl implements CustomerDAO {
	static Logger log = Logger.getLogger(CustomerDAO.class.getName());

	@Override
	public int Addcustomer(Customer customer) {

		Connection connection = null;
		int newId = 0;

		try {
			connection = new DataBaseConnection().getDataBaseConnection();
			String query = "insert into  customer(id,title,name,email,address) values (?,?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			newId = IdGenerator.generateCustomerId("id", "customer");

			preparedStatement.setInt(1, newId);
			preparedStatement.setString(2, customer.getTitle());
			preparedStatement.setString(3, customer.getName());
			preparedStatement.setString(4, customer.getEmail());
			preparedStatement.setString(5, customer.getAddress());
			preparedStatement.execute();

		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
				log.error(e);
			}
		}
		/*
		 * Connection connection = null; int newId = 0; try { connection = new
		 * DataBaseConnection().getDataBaseConnection(); newId =
		 * IdGenerator.generateCustomerId("id", "customer"); String query =
		 * "insert into  customer(id,title,name,email,address) values ('" +
		 * newId + "','" + customer.getTitle() + "','" + customer.getName() +
		 * "','" + customer.getEmail() + "','" + customer.getAddress() + "')";
		 * 
		 * Statement statement = connection.createStatement();
		 * statement.executeUpdate(query);
		 * 
		 * 
		 * } catch (ClassNotFoundException | SQLException e) {
		 * 
		 * } finally { try { connection.close(); } catch (SQLException e) {
		 * e.printStackTrace(); log.error(e); } }
		 * 
		 * return newId;
		 * 
		 */

		return newId;
	}

	@Override
	public List<Customer> getCustomerList() {
		Connection connection = null;
		List<Customer> customers = new ArrayList<Customer>();
		try {
			connection = new DataBaseConnection().getDataBaseConnection();
			String query = "select * from customer";
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				int id = Integer.parseInt(resultSet.getString("id"));

				customers.add(new Customer(id, resultSet.getString("title"), resultSet.getString("name"),
						resultSet.getString("email"), resultSet.getString("address")));
			}

		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);

		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
				log.error(e);
			}
		}
		return customers;

	}

	@Override
	public void deleteCustomer(int id) {
		Connection connection  = null;
		try {
			connection = new DataBaseConnection().getDataBaseConnection();
			String query = "delete FROM customer Where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);

			preparedStatement.execute();

		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
				log.error(e);
			}
		}
	}

	@Override
	public void editCustomer(Customer customer) {
		
		Connection connection = null;
		try {
			connection = new DataBaseConnection().getDataBaseConnection();
			String query = "update customer set title=?,name=?, email=?,address=? where id =?";
			
			//UPDATE employee SET fname=?, lname=?, email=?, pno=? where id=?"
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			
			preparedStatement.setString(1, customer.getTitle());
			preparedStatement.setString(2, customer.getName());
			preparedStatement.setString(3, customer.getEmail());
			preparedStatement.setString(4, customer.getAddress());
			preparedStatement.setInt(5, customer.getId());
			preparedStatement.execute();

		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);

		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		/*Connection connection = null;
		try {
			connection = new DataBaseConnection().getDataBaseConnection();

			String query = "update customer set title='" + customer.getTitle() + "',name='" + customer.getName()
					+ "', email='" + customer.getEmail() + "',address='" + customer.getAddress() + "' where id ="
					+ customer.getId();
			DBHandler.setData(connection, query);

		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);

		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		*/

	}

	@Override
	public Customer getCustomer(int id) {
		Connection connection = null;
		Customer customers = null;
		try {
			connection = new DataBaseConnection().getDataBaseConnection();
			String query = "SELECT * FROM customer c where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);
			preparedStatement.execute();

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				customers = new Customer(id, resultSet.getString("title"), resultSet.getString("name"),
						resultSet.getString("email"), resultSet.getString("address"));
			}

		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);
		} finally {
		}

		return customers;

	}

	@Override
	public void deleteCustomerRecord(int id) {
		Connection connection;
		try {
			connection = new DataBaseConnection().getDataBaseConnection();
			String query = "delete FROM customer Where id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);

			preparedStatement.execute();

		} catch (ClassNotFoundException | SQLException e) {
			log.error(e);

		}

	}

}
