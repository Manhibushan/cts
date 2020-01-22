package hibernate.mapping.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="todo")

public class Todo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="todoName")
	private String todoName;
	
	@Column(name="date")
	private LocalDate date;
	@Column(name="iscomplete")
	private boolean isCompleted;

	public Todo() {
	}

	public Todo(String todoName, LocalDate date, Boolean isCompleted) {
		super();
		this.todoName = todoName;
		this.date = date;
		this.isCompleted = isCompleted;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTodoName() {
		return todoName;
	}

	public void setTodoName(String todoName) {
		this.todoName = todoName;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Boolean getIsCompleted() {
		return isCompleted;
	}

	public void setIsCompleted(Boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", todoName=" + todoName + ", date=" + date + ", isCompleted=" + isCompleted + "]";
	}
	

	

	
	
	

}
