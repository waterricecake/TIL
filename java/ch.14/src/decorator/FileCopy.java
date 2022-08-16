package decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long milliseconds = 0;
		
		try(FileInputStream fis = new FileInputStream("test.docx");
			FileOutputStream fos = new FileOutputStream("copy.docx");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			milliseconds = System.currentTimeMillis();
			int i;
			while((i=bis.read()) !=-1) {
				bos.write(i);
			}
			
			milliseconds = System.currentTimeMillis() - milliseconds;

			

		} catch (IOException e) {
			System.out.println(e);
		}
		Socket socket = new Socket();
		
		BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		isr.readLine();
		
		System.out.println("½Ã°£ : " + milliseconds);
		
	}

}
