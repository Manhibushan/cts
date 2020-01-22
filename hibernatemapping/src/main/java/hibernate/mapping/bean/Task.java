package hibernate.mapping.bean;

import javax.persistence.Column;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="task")
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="tname")
	private String taskname;
	@OneToOne(cascade =CascadeType.ALL)
	@JoinColumn(name="todo_id")
	private Todo todo;
	public Task(String taskname) {
		super();
		this.taskname = taskname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTaskname() {
		return taskname;
	}
	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	public Todo getTodo() {
		return todo;
	}
	public void setTodo(Todo todo) {
		this.todo = todo;
	}
	@Override
	public String toString() {
		return "Task [id=" + id + ", taskname=" + taskname + ", todo=" + todo + "]";
	}
	
	
	
	
	

}
