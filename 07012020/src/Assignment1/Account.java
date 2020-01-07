package Assignment1;

public class Account {
	private Integer accId;
	private String name;
	private String address;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getAccId() {
		return accId;
	}

	public void setAccId(Integer accId) {
		this.accId = accId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Account(Integer accId, String name, String address) {
		super();
		this.accId = accId;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Account [accId=" + accId + ", name=" + name + ", address=" + address + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Savings)
		{
			System.out.println("savings account");
		}
		else if(obj instanceof Current)
		{
			System.out.println("current Account");
		}
		else
		{
			System.out.println("unknown");
		}
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
	

}
