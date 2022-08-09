package interfaceex;

public class CalcTest {

	public static void main(String[] args) {
		// \TODO Auto-generated method stub
		
		CompleteCalc calc = new CompleteCalc();
		int n1 = 10;
		int n2 = 2;
		
		System.out.println(calc.add(n1,n2));
		System.out.println(calc.substract(n1,n2));
		System.out.println(calc.times(n1,n2));
		System.out.println(calc.divide(n1,n2));
		calc.showInfo(); // 선언을 CompleteCalc가 아닌 Calc로 할경우 추상매소드이기 때문에 showinfo가 안됨
	}
	
}
