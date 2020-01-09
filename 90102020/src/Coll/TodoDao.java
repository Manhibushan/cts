package Coll;

import java.util.List;

public interface TodoDao 
{
	public ToDo createToDo(String toDoName);
	public List<ToDo> getAllToDos();
	public ToDo findById(String toDoId);
	//public ToDo update(String toDoId);
	public void Delete(String toDoId);
	public void removeAllToDo();
	

}
