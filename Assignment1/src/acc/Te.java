package acc;

public class Te {
	public static void main(String args[]) {
		Current ca=new Current(21000, "manhi", "Banglore ITPL", (double) 75000);
		Account account=new Current(300210, "john", "Banglore Manyatha", (double) 20000);
		Saving sa=new Saving(1.5F, 18010.00);
		Account a1=new Account(10, "Sra1", "White Field");
		
		System.out.println(ca.toString());

		System.out.println(sa.toString());

		System.out.println(a1.toString());

		System.out.println(account.toString());
		
		System.out.println("\n\n"+a1.equals(ca));
		
				
	}

}
