package taskk;

public class Tester {
	public static void main(String[] args)
	{
			ToDo todo=new ToDo(); 
			todo.createTodo("john","Learning angular",false);
			System.out.println(todo.getTodoDetails());
	}
	

}
