package ch7;

public class Overidingtest {
	public static void main(String[] args) {
		Customer customerLee = new Customer(10010,"이순신");
		System.out.println(customerLee.showCustomerInfo());
		
		VIPcustomer customerKim = new VIPcustomer(10020,"김유신");
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		System.out.println(customerLee.showCustomerInfo()+ priceLee);
		System.out.println(customerKim.showCustomerInfo()+ priceKim);
		
		Customer customerNo = new VIPcustomer(10030, "나몰라");
		customerNo.bonusPoint = 10000;
		System.out.println(customerNo.showCustomerInfo()+ customerNo.calcPrice(10000));
	}
	
}
