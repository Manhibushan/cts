package trans;

public abstract class Transport {
	private int src;
	private int dst;
	private double speed;
	public  abstract double calculateDistance(double src,double dest);
	
	public abstract double fuelEfficiency(double intialfuel,double compfuel );
	
	

}
