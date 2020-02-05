package com.example.demo.error;

public class Errormessage {
	private String message;
	private int status;
	private Long errortime;
	public Errormessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Errormessage(String message, int status, Long errortime) {
		super();
		this.message = message;
		this.status = status;
		this.errortime = errortime;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Long getErrortime() {
		return errortime;
	}
	public void setErrortime(Long errortime) {
		this.errortime = errortime;
	}
	

}
