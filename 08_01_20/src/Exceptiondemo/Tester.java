package Exceptiondemo;

public class Tester {
	public void calculate(String a) throws ArithmeticException,NumberFormatException
	{
		System.out.println();
		System.out.println(Integer.parseInt(a)/0);
	}
	public static void main(String[] args) {
	Tester tester=new Tester();
	try {
		tester.calculate(args[0]);	
	} catch (Exception e) {
		System.err.println(e.toString());
		e.printStackTrace();
	}

}
}
