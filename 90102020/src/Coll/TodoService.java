package Coll;

import java.util.List;

public interface TodoService 
{
	public ToDo createtodo(String todoName);
	public List<ToDo> getAllTodos();
	public ToDo findbyId(String toDoId);
	public void deleteToDo(String toDoId);
	public void removeAllToDo();

}
