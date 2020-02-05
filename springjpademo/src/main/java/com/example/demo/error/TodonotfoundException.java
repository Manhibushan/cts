package com.example.demo.error;
@SuppressWarnings("serial")
public class TodonotfoundException extends RuntimeException {
	private String message;

	public TodonotfoundException(String message) {
		super();
		this.message = message;
	}
	public String getmessage()
	{
		return message;
	}
	
	
	
	

}
