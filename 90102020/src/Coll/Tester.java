package Coll;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Tester {
private static Scanner scanner=new Scanner(System.in);
	
	private  TodoService service=null;
	
	
	{
		service=new ToDoserviceimp();
	}
	public static void main(String[] args)
	{
		Tester tester=new Tester();
		int choice=0;
		do {
		System.out.println("1. create todo");
		System.out.println("2. display all todo");
		System.out.println("3. find todo");
		System.out.println("4. Delete");
		System.out.println("5. remove all");
		System.out.println("0. exit");
		System.out.print("Enter your choice: ");
		try {
			choice=scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e.toString());
		}
		switch (choice) {
		case 1:
			System.out.println("provide task name: ");
			ToDo toDo=tester.service.createtodo(scanner.next());
			System.out.println("TODO Created sucessfully: "+toDo);
			break;
		case 2:
			List<ToDo> list=tester.service.getAllTodos();
			for(ToDo t:list)
			System.out.println(t+"\n");
			break;
		case 3:
			System.out.print("provide todo Id: ");
			ToDo toDo1=tester.service.findbyId(scanner.next());
			if(toDo1!=null)
			{
				System.out.println(toDo1);
			}
			else {
				System.out.println("no such todo available");
			}
			break;
		case 4:
			System.out.println("provide todo Id:");
			tester.service.deleteToDo(scanner.next());
			break;
		case 5:
			tester.service.removeAllToDo();
			System.out.println("Batch Removed Successfully");
			break;
		/*case 6:
			System.out.println("provide task id");
			ToDo toDo2=tester.service.update(scanner.next());
			System.out.println("updated Successfully");
			break;*/
			
		
			
		case 0:
			System.out.println("bye");
			System.exit(0);
			break;

		default:
			System.out.println("invalid choice");
			break;
		}
			
		}while(choice !=0);
	}
	

}
