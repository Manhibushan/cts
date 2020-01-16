package Thread;

public class ThreadgroupTest {

	public static void main(String[] args) {
		new SimpThreadGroup("Botson").start();
		new SimpThreadGroup("NewYork").start();
		new SimpThreadGroup("NewYork").start();
		ThreadGroup group=Thread.currentThread().getThreadGroup();
		System.out.println("Number of active threads in Threadgroup is"+group.activeCount());
		Thread[] tarray=new Thread[10];
		int actualsize=group.enumerate(tarray);
		for (int i=0; i<actualsize;i++)
		{
            System.out.println("Thread " + tarray[i].getName() 
                               + " in thread group " + group.getName());
        }
		

		
		// TODO Auto-generated method stub

	}

}
