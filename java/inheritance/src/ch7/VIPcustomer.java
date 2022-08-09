package ch7;

public class VIPcustomer extends Customer{
	
	double saleRatio;
	private int agentID;
	
	public VIPcustomer(int customerID, String customerName){
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio =0.1;
	}

	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		bonusPoint += price *bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	
	
	
}
