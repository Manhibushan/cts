package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
@Document
@Data
public class Item {
	@Id
	private String itemId;
	private String itemName;
	private String itemPrice;
	//@JsonFormat(shape = JsonFormat.Shape.STRING,pattern="dd-MM-yyyy")
	//private String Localdate;
	public Item(String itemName, String itemPrice) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

}
