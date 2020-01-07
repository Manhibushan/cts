
public class Te {
	public static void main(String[] args) {
		
		Coun c = new Coun();
		Coun.InnerCounter iCounter = c.new InnerCounter();
		iCounter.add(10, 20);
		c.displayMAX();

	}
}
