package reader;


import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fis = new FileReader("reader.txt");
		int i;
		while((i = fis.read())!=-1) {
			System.out.print((char)i);
		}
		
		fis.close();
		
		
		System.out.println();
		
		FileInputStream fis2 =new FileInputStream("reader.txt");
		InputStreamReader isr = new InputStreamReader(fis2);
		while((i=isr.read()) !=-1) {
			System.out.print((char)i);
		}
		isr.close();
		
		
	}

}
