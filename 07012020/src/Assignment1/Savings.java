package Assignment1;

public class Savings extends Account {
Float rateofIntrest;
Integer amount;
public Savings() {
	super();
	// TODO Auto-generated constructor stub
}
public Savings(Integer accId, String name, String address,Float rateofIntrest, Integer amount) {
	super();
	this.rateofIntrest = rateofIntrest;
	this.amount = amount;
}
@Override
public String toString() {
	return "Savings [rateofIntrest=" + rateofIntrest + ", amount=" + amount + "]";
	
}



	
}
