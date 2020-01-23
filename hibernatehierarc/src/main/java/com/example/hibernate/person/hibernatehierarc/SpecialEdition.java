package com.example.hibernate.person.hibernatehierarc;

import java.time.LocalDate;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("special_edition_book")
public class SpecialEdition extends Book {
	private String newfeatures;

	public SpecialEdition() {
	}

	public SpecialEdition(String title, String artist, LocalDate purchaseDate, double cost, String features) {
		super(title, artist, purchaseDate, cost);

		newfeatures = features;
	}

	public void setNewfeatures(String s) {
		newfeatures = s;
	}

	public String getNewfeatures() {
		return newfeatures;
	}
	

}
