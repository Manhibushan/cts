package com.example.demo.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(exclude = "date")
public class Item {
	@Id
	private String itemId;
	private String itemName;
	private String itemPrice;
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern="dd-MM-yyyy")
	@JsonIgnore
	private  LocalDate date;
	private Product product;
	public Item(String itemName, String itemPrice, LocalDate date, Product product) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.date = date;
		this.product = product;
	}
	
	
}
