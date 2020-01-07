package coa;

public class BoxingunboxingDemo {
private Integer wInt;
private int pInt;
public BoxingunboxingDemo(Integer wInt,int pInt) {
	super();
	// TODO Auto-generated constructor stub
	this.wInt=wInt;
	this.pInt=pInt;
}

@Override
public String toString() {
	return "BoxingunboxingDemo [wInt=" + wInt + ", pInt=" + pInt + "]";
}

public void display()
{
	int tempp=wInt;
	Integer tempw=pInt;
	System.out.println(this);
	System.out.printf("After Auto Boxing/unboxing: %d %d ",wInt,pInt);
}

}
