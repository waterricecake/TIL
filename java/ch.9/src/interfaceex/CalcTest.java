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
		calc.showInfo(); // ���몄�� CompleteCalc媛� ���� Calc濡� ��寃쎌�� 異���留ㅼ�����닿린 ��臾몄�� showinfo媛� ����
		
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum);
	
	
	}
	
}
