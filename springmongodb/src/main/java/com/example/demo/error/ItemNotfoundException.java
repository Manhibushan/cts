package com.example.demo.error;
@SuppressWarnings("serial")
public class ItemNotfoundException extends RuntimeException {
	private String message;

	public ItemNotfoundException(String message) {
		super();
		this.message = message;
	}
	public String getmessage()
	{
		return message;
	}
	
	
	
	

}
