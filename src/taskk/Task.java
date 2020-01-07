package taskk;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {
	private String taskId;
	private String author;
	private String taskname;
	public void createTask(String author,String taskName)
	{
		setTaskname(taskname);
		setAuthor(author);
		setTaskId(UUID.randomUUID().toString());
	}
	public String getTaskDetails()
	{
		return "Task Id" +getTaskId()+"Taskname"+getTaskname()+"created by"+getAuthor();
	}

	

}
