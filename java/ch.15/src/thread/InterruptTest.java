package thread;

public class InterruptTest extends Thread{
	public void run() {
		int i;
		for(i = 0;i<100;i++) {
			System.out.println(i);
			
		}
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			System.out.println("wake!!!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterruptTest test = new InterruptTest();
		
		test.start();
		test.interrupt();//sleep(),join().wait()에 걸린 쓰레드가 생기면 예외가 발생함
		System.out.println("end");
	}

}
