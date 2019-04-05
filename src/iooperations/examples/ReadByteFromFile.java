package iooperations.examples;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadByteFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("./test_one.txt");
			int i = fis.read();
			while(i != -1) {
				System.out.print((char)i);
				i = fis.read();
			}
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
