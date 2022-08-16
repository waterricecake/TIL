package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {
	
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowException test = new ThrowException();
		try {
			test.loadClass("b.txt", "java.lang.string");
		} catch (FileNotFoundException |ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println("end");
	}

}
