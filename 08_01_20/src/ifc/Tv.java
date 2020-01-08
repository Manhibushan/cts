package ifc;

public class Tv extends Electronics {
	    
	    int size;
	    
	   
	    public Tv(double regularPrice,String manufacturer,int size) {
	        super(regularPrice, manufacturer);
	        this.size = size;
	    }
	    
	    // Override the method
	    public double computeSalePrice(){
	        return super.getRegularPrice() * 0.8;
	    }

}
