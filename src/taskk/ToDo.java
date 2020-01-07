package taskk;

import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ToDo {
	private Task task;
	private String todoId;
	private LocalDate date;
	private boolean isCompleted;
	
	public void createTodo(String author,String taskName,boolean isCompleted)
	{
		System.out.println("creating new task");
		task=new Task();
		task.createTask(author,taskName);
		System.out.println("success\n creating new todo--");
		setTodoId(UUID.randomUUID().toString());
		setDate(LocalDate.now());
		setCompleted(isCompleted);
		
	}
	
		
	
	public String getTodoDetails()
	{
		return task.getTaskDetails()+"todoid"+getTodoId()+"todo date:"+getDate()+"completed:"+isCompleted;
		
	}
	
		
		
}


	
	


