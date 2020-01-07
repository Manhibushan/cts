package taskk;

public class Myarray {
	private char[] s;
	private String str;
	private int count=0;
	private char[] temparray;
	{
		s=new char[26];
	}
	public char[] createArray()
	{
		for(int i=0;i<s.length;i++)
		{
			s[i]=(char)('A'+i);
		}
		str="HELLO WORLD";
		return s;
		
	}
	public void displayArray()
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+",");
		}
	}
	public void convertStringToArray(String str)
	{
		this.str=str;
		temparray=str.toCharArray();
		
		
	}
		
	public void displayConvertedArray()
	{
		
		for(char ch:temparray)
		{
			System.out.println(ch);
		}
	}
	public void displayNochars()
	{
		for (int i=0;i<str.length();i++)
		{
			  if(str.charAt(i) != ' ')    
	                count++;   
			  
		}
		System.out.println("No of chars"+count);
		
	}

}
