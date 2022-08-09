package Template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("start car");
	}
	public void turnoff() {
		System.out.println("turnoff");
	}
	
	//final이 붙으면 하위클라스에서 재정의 불가능
	final public void run() {
		startCar();
		drive();
		stop();
		turnoff();
	}
}
