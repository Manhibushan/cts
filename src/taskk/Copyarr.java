package taskk;

public class Copyarr {
	public static void main(String[] args)
	{
		int[] myarr= {1,2,3,4,5,6};
		int[] hold= {10,9,8,7,6,5,4,3,2,1};
		System.arraycopy(myarr,0,hold,0,myarr.length);
		for(int a:hold)
		{
			System.out.println(a);
			
		}
	}

}
