package Coll;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class TodoDaoImp implements TodoDao
{
	private List<ToDo> todolist=null;
	private ToDo todo;
	{
		
			todolist=new ArrayList<ToDo>();
		
	}
	
	@Override
	public ToDo createToDo(String toDoName) {
		String str[]=UUID.randomUUID().toString().split("-");
		todo=new ToDo((str[0]+str[1]).toLowerCase(),toDoName);
		todolist.add(todo);
		return todo;
		
	}
	@Override
	public List<ToDo> getAllToDos() 
	{
		if(todolist.isEmpty())
		{
			System.out.println("list is empty");
			
		}
		
		
		return todolist;
	}
	@Override
	public ToDo findById(String toDoId)
	{
		Iterator<ToDo> iterator=todolist.iterator();
		
		while(iterator.hasNext())
			for(ToDo t:todolist)
		{
			todo=iterator.next();
			if(todo.getTodoId()==toDoId)
				if(todo.getTodoId().equals(toDoId))
			{
				
				System.out.println(todo.getTodoId());
				todo=t;
				System.out.println("Not found");
				break;
			}
		}
		return todo;
		
	}
	@Override
	public void Delete(String toDoId) {

		if(todolist.isEmpty())
		{
			System.out.println("list is empty");
			
		}
		todo=findById(toDoId);
		if(todo==null)
		{
			System.out.println("no such todo to delete");
		}
		else
		{
			todolist.remove(todo);
			System.out.println("removed sucessfully with id: "+toDoId);
		}
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeAllToDo() {
		todolist.removeAll(todolist);
		// TODO Auto-generated method stub
		
	}
	
	

}
