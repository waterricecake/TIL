package stream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("input: ");
		try {
			int i = System.in.read(); //InputStream -->byte --return to int -->return -1 if end of the stream
			System.out.println(i);
			System.out.println((char)i);
		} catch(IOException e) {
			System.out.println(e);
		}
		}

}
