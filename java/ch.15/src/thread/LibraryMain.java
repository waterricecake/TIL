package thread;

import java.util.ArrayList;

class FastLibrary{
	public ArrayList<String> books = new ArrayList<String>();
	
	public FastLibrary() {
		books.add("ÅÂ¹é»ê¸Æ1");
		books.add("ÅÂ¹é»ê¸Æ2");
		books.add("ÅÂ¹é»ê¸Æ3");
		books.add("ÅÂ¹é»ê¸Æ4");
		books.add("ÅÂ¹é»ê¸Æ5");
	}
	public synchronized String lendBook() throws InterruptedException {
		Thread t = Thread.currentThread();
		while(books.size()==0) {
			System.out.println(t.getName() + " wating start");
			wait();
			System.out.println(t.getName() + " wating end");
		}
		String title = books.remove(0);
		System.out.println(t.getName()+":"+title +" lend");
		return title;
	}
	public synchronized void reutrnBook(String title) {
		Thread t = Thread.currentThread();
		books.add(title);
		notifyAll();
		System.out.println(t.getName()+":"+title +" return");
	}
}

class Student extends Thread{
	public void run() {
		
		try {
			String title = LibraryMain.library.lendBook();
			sleep(5000);
			LibraryMain.library.reutrnBook(title);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class LibraryMain {
	public static FastLibrary library = new FastLibrary();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		Student st4 = new Student();
		Student st5 = new Student();
		Student st6 = new Student();
		
		st1.start();
		st2.start();
		st3.start();
		st4.start();
		st5.start();
		st6.start();

	}

}
