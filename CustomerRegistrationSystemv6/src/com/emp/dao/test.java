/**package com.virtusa.dao;

import com.virtusa.model.Employee;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.virtusa.database.ConnectionManager;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private ConnectionManager connectionManager;

	final static Logger logger = Logger.getLogger(EmployeeDAOImpl.class.getName());

	public List<Employee> getAllEmployees() {

		List<Employee> employees = new ArrayList<Employee>();

		try {
			Connection connection = connectionManager.getConnection();
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("SELECT * FROM employee ORDER BY id DESC");

			while (rs.next()) {
				Employee employee = new Employee();
				employee.setId(rs.getInt("id"));
				employee.setFname(rs.getString("fname"));
				employee.setLname(rs.getString("lname"));
				employee.setEmail(rs.getString("email"));
				employee.setPno(rs.getString("pno"));
				employees.add(employee);
			}
			rs.close();
			statement.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			logger.error("Somthing wrong!", e);
		}
		return employees;
	}

	@Override
	public void create(Employee employee) {
		BasicConfigurator.configure();
		Connection connection;
		try {
			connection = connectionManager.getConnection();

			PreparedStatement preparedStatementValidate = connection
					.prepareStatement("SELECT count(1) FROM employee WHERE email=?");
			preparedStatementValidate.setString(1, employee.getEmail());

			ResultSet resultSet = preparedStatementValidate.executeQuery();

			if (resultSet.next() && resultSet.getInt(1) > 0) {
				logger.info("Email Id is alredy exists...");

			} else {
				PreparedStatement preparedStatement = connection.prepareStatement(
						"insert into employee (fname, lname, email, pno, password) values (?,?,?,?,?)");
				preparedStatement.setString(1, employee.getFname());
				preparedStatement.setString(2, employee.getLname());
				preparedStatement.setString(3, employee.getEmail());
				preparedStatement.setString(4, employee.getPno());
				preparedStatement.setString(5, employee.getPassword());

				preparedStatement.execute();
				logger.info("Record is inserted into Employee table!");

				preparedStatement.close();
			}
			resultSet.close();
			connection.close();

		} catch (ClassNotFoundException | SQLException e) {
			logger.error("Somthing wrong!", e);
		}

	}

	@Override
	public void delete(Integer id) {
		BasicConfigurator.configure();
		Connection connection;
		try {
			connection = connectionManager.getConnection();
			PreparedStatement preparedStatementDelete = connection.prepareStatement("DELETE FROM employee WHERE id=?");
			preparedStatementDelete.setInt(1, id);

			preparedStatementDelete.executeUpdate();
			logger.info("Record is deleted!");

			preparedStatementDelete.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			logger.error("Somthing wrong!", e);
		}

	}

	@Override
	public void update(Employee employee, Integer id) {

		Connection connection;
		try {
			connection = connectionManager.getConnection();

			PreparedStatement preparedStatementUpdate = connection
					.prepareStatement("UPDATE employee SET fname=?, lname=?, email=?, pno=? where id=?");

			preparedStatementUpdate.setString(1, employee.getFname());
			preparedStatementUpdate.setString(2, employee.getLname());
			preparedStatementUpdate.setString(3, employee.getEmail());
			preparedStatementUpdate.setString(4, employee.getPno());
			preparedStatementUpdate.setInt(5, id);

			preparedStatementUpdate.executeUpdate();
			logger.info("Record is Updated-logger");

			preparedStatementUpdate.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			logger.error("Somthing wrong!", e);
		}

	}

	@Override
	public Employee getEmployee(Employee employee, Integer id) {

		Connection connection;
		try {
			connection = connectionManager.getConnection();
			PreparedStatement preparedStatementViewUpdate = connection
					.prepareStatement("SELECT * FROM employee WHERE id=?");
			preparedStatementViewUpdate.setInt(1, id);
			ResultSet rs = preparedStatementViewUpdate.executeQuery();

			employee.setId(id);
			while (rs.next()) {
				employee.setFname(rs.getString("fname"));
				employee.setLname(rs.getString("lname"));
				employee.setEmail(rs.getString("email"));
				employee.setPno(rs.getString("pno"));
			}

			rs.close();
			preparedStatementViewUpdate.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			logger.error("Somthing wrong!", e);
		}
		return employee;
	}

	@Override
	public boolean isValidUser(String email, String password) {

		Connection connection;
		try {
			connection = connectionManager.getConnection();
			PreparedStatement preparedStatementlogin = connection
					.prepareStatement("SELECT COUNT(1) FROM employee WHERE email = ? AND password = ?");

			preparedStatementlogin.setString(1, email);
			preparedStatementlogin.setString(2, password);

			ResultSet resultSet = preparedStatementlogin.executeQuery();
			if (resultSet.next() && resultSet.getInt(1) > 0) {
				logger.info("Login Sucess");
				return true;
			} else {
				logger.info("Login Fail");
				return false;
			}

		} catch (ClassNotFoundException | SQLException e) {
			logger.error("Somthing wrong!", e);
		}
		return true;

	}

}*/
