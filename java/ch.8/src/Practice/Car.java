package Practice;

public abstract class Car {
	public abstract void start();
	public abstract void drive();
	public  void stop() {
		System.out.println("stop car");
	}
	public  void turnoff() {
		System.out.println("turnoff car");
	};
	
	final public void run() {
		start();
		drive();
		stop();
		turnoff();
	}
}
