package cd;

import java.util.Scanner;

public class Tester {
	
	private static final int MAX=5;
	
	
	private static Scanner s=new Scanner(System.in);

	public static void main(String[] args) {
		int counter=-1;
		ToDo todos[]=new ToDo[MAX];
		int choice=0;
		ToDo todo=new ToDo();
		ToDo tempTodo=null;
		do {
			System.out.println("1.add new todo.");
			System.out.println("2.display all todo");
			System.out.println("0. exit");
			System.out.print("slect your choice: ");
			choice=s.nextInt();
			switch (choice) {
			case 1:
				if(counter==MAX-1)
				{
					System.out.println("Cant not create more todo...");
					break;
				}
				System.out.print("task author: ");
				String author=s.next();
				System.out.print("task name: ");
				String taskName=s.next();
				System.out.print("Is Completed? ");
				boolean isCompleted=s.nextBoolean();
				tempTodo=todo.createTodo(author, taskName, isCompleted);
				todos[++counter]=tempTodo;
				break;
			case 2:
				for(int i=0;i<=counter;i++)
				{
					System.out.println("\n"+todos[i].getTodoDetails());
				}
				break;
			case 0:
				System.out.println("bye!!!!");
				System.exit(0);
			
				break;

			default:
				System.out.println("invalid choice");
				break;
			}
		} while (choice !=0);
	
		/*
		 * Todo todo=new Todo(new Task(),new RandomFortuneSeervice());
		 * todo.createTodo("John", "Learning Angular", false);
		 * System.out.println(todo.getTodoDetails());
		 */
	}

}
