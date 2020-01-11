
package Thread;

public class MaxPrioritytest {
public static void main(String[] args)
{
	ThreadGroup groupNORM=new ThreadGroup("A group with normal priority");
	Thread priorityMAX=new Thread(groupNORM,"A thread with Maximum priority");
	Thread priorityMIN=new Thread(groupNORM,"A thread Minimum priority");
	
	
	
	
	priorityMAX.setPriority(Thread.MAX_PRIORITY);
	groupNORM.setMaxPriority(Thread.NORM_PRIORITY);
	priorityMIN.setPriority(Thread.MIN_PRIORITY);
	
	
	System.out.format("Group's maximum priority=%d%n",groupNORM.getMaxPriority());
	System.out.format("ThreadS priority=%d%n",priorityMAX.getPriority());
	System.out.format("ThreadS priority=%d%n",priorityMIN.getPriority());
	
	}
}

