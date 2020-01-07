package array;

public class InternationalCD extends Cd {
	
	public InternationalCD() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String language;
	public InternationalCD(String cdId, String cdName, String genre, double price,String language)
	{
		super(cdId, cdName, genre, price);
		this.language=language;
	}
	//@Override
	//public String toString() {
		//return "InternationalCD==>\n  CD Details=" + super.toString() + "language=" + language;
	//}
	@Override
	public String toString() {
		return "InternationalCD [language=" + language + ", toString()=" + super.toString() + ", getCdId()=" + getCdId()
				+ ", getCdName()=" + getCdName() + ", getGenre()=" + getGenre() + ", getPrice()=" + getPrice()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
	

}
