package Exceptiondemo;

public class Exce {
	public static void main(String argv)
	{
		new Exce().dothework();
	}

	public void dothework() {
		Object o=null;
		for(int i=0;i<5;i++)
			try {
				o=makeobj(i);
			}
		catch(IllegalArgumentException e)
		{
			e.printStackTrace();
			 System.err.println("IllegalArgumentException is caught: (" + e.getMessage() + ").");
             return; 
		}
		System.out.println(o);
		
		// TODO Auto-generated method stub
		
	}

	public Object makeobj(int type)throws IllegalArgumentException {
		// TODO Auto-generated method stub
		  if (type == 1)  // detects an error...
	            throw new IllegalArgumentException("Don't like type " + type);
	        return new Object();
	}

}
