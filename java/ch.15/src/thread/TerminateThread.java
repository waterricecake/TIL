package thread;

import java.io.IOException;

public class TerminateThread extends Thread {
	private boolean flag = false;
	public TerminateThread(String name) {
		super(name);
	}
	int i;
	public void run() {
		while(!flag) {
			
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(getName() + "end");
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TerminateThread threadA = new TerminateThread("A");
		TerminateThread threadB = new TerminateThread("B");
		
		threadA.start();
		threadB.start();
		
		int in;
		while(true) {
			in = System.in.read();
			if(in == 'A') {
				threadA.setFlag(true);
			}
			else if(in =='B') {
				threadB.setFlag(true);
			}
			else if(in=='M') {
				threadA.setFlag(true);
				threadB.setFlag(true);
				break;
			}
			/*
			else {
				System.out.println("try again");
			}*/
		
		}
		System.out.println("main end");

	}

}
