package interfaceex;

public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num2 ==0 ) {
			return ERROR;
		}
		return num1 / num2;
	}
	public void showInfo() {
		System.out.println("Complete");
	}
	/*
	@Override
	public void description() {
		System.out.println("override description");
	}
*/
	public int total(int[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}
}
