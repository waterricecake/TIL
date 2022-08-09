package ch7;
import java.util.ArrayList;
public class Practice {
	public static void main(String[] args) {
		Customer cust1 = new Customer(10100,"james");
		Customer cust2 = new Customer(10101,"marry");
		GoldCustomer cust3 = new GoldCustomer(10102,"terry");
		GoldCustomer cust4 = new GoldCustomer(10103,"an");
		VIPcustomer cust5 = new VIPcustomer(10104,"ww");
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		customerList.add(cust1);
		customerList.add(cust2);
		customerList.add(cust3);
		customerList.add(cust4);
		customerList.add(cust5);
		int price;
		for(Customer cust : customerList) {
			System.out.println(cust.calcPrice(10000)+" "+ cust.bonusPoint );
		}
	}
	
}
