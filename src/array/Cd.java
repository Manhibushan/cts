package array;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cd {
	private String cdId;
	private String cdName;
	private String genre;
	private double price;
	@Override
	public String toString() {
		return "Cd [cdId=" + cdId + ", cdName=" + cdName + ", genre=" + genre + ", price=" + price + "]";
	}
	//public String toString() {
		//return "CD==>cdId= " + cdId + " cdName= " + cdName + " genre= " + genre + " price= " + price + "$";
	//}
	public void getCDType(Cd cd)
	{
		if(cd instanceof InternationalCD)
		{
			InternationalCD iCD=(InternationalCD)cd;
			System.out.println(iCD);
		}
	}
	
	

}
