package stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("input: ");
		try {
			int i;// = System.in.read(); //InputStream -->byte --return to int -->return -1 if end of the stream
			InputStreamReader isr = new InputStreamReader(System.in);
			while((i=isr.read()) != 'e') {
				System.out.print((char)i);
			}

		} catch(IOException e) {
			System.out.println(e);
		}
		}

}