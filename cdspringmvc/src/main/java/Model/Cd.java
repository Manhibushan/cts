package Model;

import java.io.Serializable;
import java.time.LocalDate;

public class Cd implements Serializable{

	
	private static final long serialVersionUID = -2655938307126216424L;
	private String title;
	private String type;
	private String year;
	private LocalDate date;
	public Cd() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cd(String title, String type, String year, LocalDate date) {
		super();
		this.title = title;
		this.type = type;
		this.year = year;
		this.date = date;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
