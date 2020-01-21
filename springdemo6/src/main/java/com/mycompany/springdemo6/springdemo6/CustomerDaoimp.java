package com.mycompany.springdemo6.springdemo6;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor

@Component("dao")
public class CustomerDaoimp implements CustomerDao {
	private DataSource datasource;
	private Connection connection;
	private PreparedStatement pstatement;
	//private static Logger logger=Logger.getLogger("com.mycompany.springdemo5.bean.CustomerDaoimp");
@Autowired	
public CustomerDaoimp(DataSource datasource) {
		super();
		this.datasource = datasource;
	}
	
	
	/*
	 * @PostConstruct public void init() { try { logger.info("getconnection");
	 * connection=datasource.getConnection(); logger.info("connection established");
	 * 
	 * 
	 * }catch(SQLException e) { e.printStackTrace();
	 * 
	 * } }
	 */
	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
	pstatement=connection.prepareStatement("Insert into customer(uId,first_name,last_name,email) values(?,?,?,?)");
	pstatement.setString(1, customer.getUId());
	pstatement.setString(2, customer.getFName());
	pstatement.setString(3, customer.getLname());
	pstatement.setString(4, customer.getEmail());
	
		return customer;


	}


	@Override
	public List<Customer> getAllCustomers() throws SQLException{
		pstatement=connection.prepareStatement("select uid,first_name,"
				+ "last_name,email from"
				+ " customer");
		
		ResultSet rSet=pstatement.executeQuery();
		List<Customer> list=new ArrayList<Customer>();
		while(rSet.next())
		{
			Customer customer=new Customer(rSet.getString("uid"),
					rSet.getString("first_name"), rSet.getString("last_name"), 
					rSet.getString("email"));
			list.add(customer);
		}
		return list;
		
		
	}



	@Override
	public List<Customer> findbyId(String uId) throws SQLException {
		pstatement=connection.prepareStatement("select uid,first_name,"
				+ "last_name,email from"
				+ " customer where uid=?");
		pstatement.setString(1, uId);
		ResultSet rSet=pstatement.executeQuery();
		List<Customer> list=new ArrayList<Customer>();
		while(rSet.next())
		{
			Customer customer=new Customer(rSet.getString("uid"),
					rSet.getString("first_name"), rSet.getString("last_name"), 
					rSet.getString("email"));
			list.add(customer);
		}
		return list;
	}



	@Override
	public Customer updateCustomer(Customer customer, String uId)throws SQLException {
		pstatement=connection.prepareStatement("update customer "
				+ "set first_name=? , "
				+ "last_name=?, "
				+ "email=?"
				+ " where uid=?");
		pstatement.setString(1, customer.getFName());
		pstatement.setString(2, customer.getLname());
		pstatement.setString(3, customer.getEmail());
		pstatement.setString(4, uId);
		pstatement.executeUpdate();
		return customer;
	}



	

	

}
