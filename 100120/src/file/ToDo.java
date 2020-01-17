package file;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;


public class ToDo implements Serializable{
	private String todoId;
	private String todoName;
	private LocalDate date;
	public ToDo(String todoId, String todoName, LocalDate date) {
		super();
		this.todoId = todoId;
		this.todoName = todoName;
		this.date = date;
	}
	

}
