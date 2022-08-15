package practice;
import java.util.ArrayList;
import java.util.stream.Stream;

public class CustomerTest {
	public static void main(String[] args) {
		Customer cust1 = new Customer(40,"Lee",100);
		Customer cust2 = new Customer(20,"Kim",100);
		Customer cust3 = new Customer(13,"Hong",50);
		
		ArrayList<Customer> custarr = new ArrayList<Customer>();
		custarr.add(cust1);
		custarr.add(cust2);
		custarr.add(cust3);
		Stream<Customer> stream = custarr.stream();
		stream.forEach(s->System.out.print(s.getName()+" "));
		System.out.println();
		Stream<Customer> streamsum = custarr.stream();
		System.out.println(streamsum.map(s ->s.getCost()).reduce(0,(s1,s2)->s1+s2));

		Stream<Customer> streamage = custarr.stream();
		streamage.sorted().filter(s->s.getAge()>=20).forEach(n->System.out.print(n.getName()+" "));
	
	} 
	
}
