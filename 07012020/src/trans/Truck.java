package trans;

public class Truck extends Transport{
	private double temp;
	public   double calculateDistance(double src,double dst)
	{
		temp=dst-src;
		return temp;
	}
	public  double fuelEfficiency(double intialfuel,double compfuel )
	{
		double fuelconsume=intialfuel-compfuel;
		double efficiency=calculateDistance(100,200)/fuelconsume;
		return temp/efficiency;
		
		
		
	}
	

}
