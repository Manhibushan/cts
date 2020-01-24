package com.example.hibernate.person.onetomany.asssignmentmappingdemo;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter


public class Comments {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int id;
	
	private String text;
	
	private LocalDateTime datetime;
	
	
	
	public Comments() {
	
	}
	public Comments(String text, LocalDateTime datetime) {
		super();
		this.text = text;
		this.datetime = datetime;
	}
	


	
	

}
