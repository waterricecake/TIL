package practice;

public class Customer implements Comparable<Customer>{
	private int Age;
	private String Name;
	private int Cost;
	
	public Customer(int Age, String Name, int Cost) {
		this.Age = Age;
		this.Name = Name;
		this.Cost = Cost;
	}
	
	public int getAge() {
		return this.Age;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public int getCost() {
		return this.Cost;
	}

	@Override
	public int compareTo(Customer cust) {
		// TODO Auto-generated method stub
		return this.Name.compareTo(cust.getName());
	}

}
