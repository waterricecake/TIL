package outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		byte[] bs = new byte[26];
		byte data =65;
		for(int i=0; i<bs.length;i++) {
			bs[i] = data;
			data ++;
		}
		try(FileOutputStream fos = new FileOutputStream("output.txt");
			FileInputStream fis = new FileInputStream("output.txt")	){
			fos.write(bs);
			int ch;
			while((ch = fis.read()) != -1) {
				System.out.print((char)ch);
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		
		
	}

}
