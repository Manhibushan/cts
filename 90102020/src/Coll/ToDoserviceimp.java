package Coll;

import java.util.List;

public class ToDoserviceimp implements TodoService {
	private TodoDao dao=null;
	{
		dao=new TodoDaoImp();
	}
	@Override
	public ToDo createtodo(String todoName) {
		// TODO Auto-generated method stub
		return dao.createToDo(todoName);
	}
	@Override
	public List<ToDo> getAllTodos() {
		// TODO Auto-generated method stub
		return dao.getAllToDos();
	}
	@Override
	public ToDo findbyId(String toDoId) {
		// TODO Auto-generated method stub
		return dao.findById(toDoId);
	}
	@Override
	public void deleteToDo(String toDoId) {
		// TODO Auto-generated method stub
		dao.Delete(toDoId);
	}
	@Override
	public void removeAllToDo() {
		dao.removeAllToDo();
		// TODO Auto-generated method stub
		
	}
	
	

}
