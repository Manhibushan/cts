package com.mycompany.springdemo5.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;


@Component("dao")
public class CustomerDaoimp implements CustomerDao {
	private DataSource datasource;
	private Connection connection;
	private PreparedStatement pstatement;
	private static Logger logger=Logger.getLogger("com.mycompany.springdemo5.bean.CustomerDaoimp");
@Autowired	
public CustomerDaoimp(DataSource datasource) {
		super();
		this.datasource = datasource;
	}
	
	
	@PostConstruct
	public void init()
	{
		try
		{
			logger.info("getconnection");
			connection=datasource.getConnection();
			logger.info("connection established");
			
					
		}catch(SQLException e)
		{
			e.printStackTrace();
			
		}
	}
	@Override
	public Customer createCustomer(Customer customer) throws SQLException {
	pstatement=connection.prepareStatement("Insert into customer(uid,first_name,last_name,email) values(?,?,?,?)");
	pstatement.setString(1, customer.getUId());
	pstatement.setString(2, customer.getFName());
	pstatement.setString(3, customer.getLname());
	pstatement.setString(4, customer.getEmail());
	
		return customer;


	}

}
