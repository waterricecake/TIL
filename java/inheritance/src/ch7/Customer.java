package ch7;

public class Customer {
	protected int cutomerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer(int customerID, String customerName) {
		this.cutomerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer(int,String) generater call");
	}
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;

	}
	
	public String showCustomerInfo() {
		return customerName + "'s grade:" + customerGrade + "point: " + bonusPoint;
	}

	public int getCutomerID() {
		return cutomerID;
	}

	public void setCutomerID(int cutomerID) {
		this.cutomerID = cutomerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
}
