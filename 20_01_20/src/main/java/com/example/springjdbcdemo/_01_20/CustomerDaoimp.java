package com.example.springjdbcdemo._01_20;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component("dao")

public class CustomerDaoimp implements CustomerDao {
	private JdbcTemplate jdbcTemplate;
	@Autowired
	public void setJdbctemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
		String sql="insert into customer(uid,first_name,last_name,email) values(?,?,?,?)";
		jdbcTemplate.update(sql,new Object[] {customer.getUid(),customer.getFirstName(),customer.getLastName(),customer.getEmail()});
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() throws SQLException {
		String query="select uid,first_name,last_name,email from customer";
		// TODO Auto-generated method stub
		return jdbcTemplate.query(query,new CustomerRowmapper());
	}

	@Override
	public List<Customer> getCustomerbyId(String uId) throws SQLException {
		String query="select uid,first_name,last_name,email from customer where uid=?";
		return jdbcTemplate.query(query, new Object[] {uId},new CustomerRowmapper());
	}

	@Override
	public Customer updateCustomerbyId(Customer customer) throws SQLException {
		String query="update customer set first_name = ?, last_name =?,email=? where uid=?";
		jdbcTemplate.update(query,new Object[] {customer.getUid(),customer.getFirstName(),customer.getLastName(),customer.getEmail()});
		return customer;
		
	}

	@Override
	public Customer deleteCustomerbyId(Customer customer) throws SQLException {
	String query="delete customer where id=?";
	jdbcTemplate.update(query,new Object[] {customer.getUid()});
	return customer;
	
	
	}

	
		
	}


