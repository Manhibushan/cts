package acc;

public class Current extends Account {
	Boolean isEligible;
	Double amount;
	public Current() {
		super();
	}
	
	public Current(Integer acId, String name, String add, Double amount) {
		super(acId, name, add);
		this.amount=amount;
	}
	
	

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		if(amount>=50000) {
			isEligible=true;
		}
		else {
			isEligible=false;
		}
		return "\nCurrentAc [isEligible=" + isEligible + ", amount=" + amount + ", acId=" + acId + ", name=" + name
				+ ", add=" + add +"]";

	}
	
	
	


	

}
