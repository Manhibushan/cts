package acc;

public class Saving {
	Float rateOfIntrest;
	Double amount;
	public Saving() {
		super();
	}
	public Saving(Float rateOfIntrest, Double amount) {
		super();
		this.rateOfIntrest = rateOfIntrest;
		this.amount = amount;
	}
	@Override
	public String toString() {
		
		return "\nSavingAc [rateOfIntrest=" + rateOfIntrest + ", amount=" + amount + "]";
	}

}
