package password;

import java.util.Arrays;

import exep.EmployeeNotEligibleException;

public class PasswordCheck {
	
	
	public PasswordCheck createpassword(String pwd ,char[] tempar)throws InvalidPasswordChoice
	{
	char currChar;
	for(int i=0;i<pwd.length();i++)
	{
		if(!(currChar>='a'&&currChar<='z')||(currChar>='A'&&currChar<='Z')||(currChar>='0'&&currChar>='9'))
		{
			throw new InvalidPasswordChoice("password is not valid");
		}
		
	}
		
	}
			
	
	
	
	
	
	
	
}
