package coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee americano = new KenyaAmeriacno();
		americano.brewing();
		System.out.println();
		
		Coffee KenyaLatte = new Latte(new KenyaAmeriacno());
		KenyaLatte.brewing();
		
		System.out.println();
		Coffee kenyaMocha = new Mocha(new KenyaAmeriacno());
		kenyaMocha.brewing();
		
		System.out.println();
		Coffee etiopiaMocha = new Mocha(new EtiopiaAmercano());
		etiopiaMocha.brewing();
	}

}
