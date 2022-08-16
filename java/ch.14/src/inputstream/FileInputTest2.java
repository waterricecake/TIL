package inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream fis= new FileInputStream("input.txt");) {		
			int i;
			byte[] bs = new byte[10];
			while((i = fis.read(bs)) != -1) {
				/*for(byte b:bs) {
					System.out.print((char)b);
				}*/ //garbage data
				for(int k =0 ; k<i;k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\nend");

	}
}
