package com;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import CustomerDto.CustomerDtoimp;
import CustomerDto.Customermapper;
import model.Customer;
import model.CustomerDto;
import servic.CustomerServiceimp;
import servic.Customerservice;

public class Customerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Customerservice service;
	private CustomerDtoimp imp;
	
    
	@Override
	public void init() throws ServletException {
		
		super.init();
		service=new CustomerServiceimp();
		imp=new Customermapper();
	}
    
    public Customerservlet() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fName=request.getParameter("fName");
		String lName=request.getParameter("lName");
		String email=request.getParameter("email");
		//CustomerDTOImpl impl = null;
		CustomerDto dto=new CustomerDto(UUID.randomUUID().toString(),fName, lName, email);
		Customer customer=service.createCustomer(imp.customerDtoToCustomer(dto));
		if(customer!=null)
		{
			List<Customer> customers=service.getAllCustomer();
			request.setAttribute("SUCCESS", customers);
			RequestDispatcher view=request.getRequestDispatcher("success.jsp");
			view.forward(request, response);
		}
		else
		{
			RequestDispatcher view=request.getRequestDispatcher("error.html");
			view.forward(request, response);
		}
	}

}
