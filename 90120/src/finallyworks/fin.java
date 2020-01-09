package finallyworks;

public class fin extends Exception
{
	private String message;

	public fin(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "fin [message=" + message + "]";
	}


	

}
