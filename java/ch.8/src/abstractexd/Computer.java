package abstractexd;

public abstract class Computer {
	//class에도 abstract 서언을 해우저야 내부에 추상메소드 사용 가능
	public abstract void display();
	public abstract void typing(); // 추상메소드
	
	public void turnon() {
		System.out.println("turn on");
	}
	
	public void turnoff() {
		System.out.println("turn off");
	}
	
}
