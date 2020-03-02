package com.example.feignuserservice;

public class Groups {
	private int id;	

	private String name;

	public Groups() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Groups(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
