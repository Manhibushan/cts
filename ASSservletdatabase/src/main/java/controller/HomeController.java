package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;


public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerService service;
	   
	@Override
	public void init() throws ServletException {
	
		super.init();
		service=new CustomerServiceImpl();
	}
       
   
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<Customer> customers=null;
			 customers = service.getAllCustomer();
			request.setAttribute("customers", customers);
			RequestDispatcher view = request.getRequestDispatcher("list-customers.jsp");
			view.forward(request, response);
		
		}
	}
