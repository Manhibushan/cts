package com.example.Movieservice.model;

public class Movie {
	private Integer id;
	private String name;
	private String synopsis;
	public Movie() {
		super();
		
	}
	public Movie(Integer id, String name, String synopsis) {
		super();
		this.id = id;
		this.name = name;
		this.synopsis = synopsis;
	}
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSynopsis() {
		return synopsis;
	}
	
	

}
