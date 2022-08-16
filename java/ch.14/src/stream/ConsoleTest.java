package stream;

import java.io.Console;

public class ConsoleTest {
	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.println("Name : ");
		String name = console.readLine();
		System.out.println("PassWord : ");
		char[] password = console.readPassword();
		
		System.out.println(name);
		System.out.println(password);
	}
}
