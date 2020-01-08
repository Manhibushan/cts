package exep;

public class Tes {

	public static void main(String args[]) throws AccountNotCreatedException
	{
		Account account=new Account();
		account.createAccount("John", 6000);
		System.out.println(account);
	
	}
}
