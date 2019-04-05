package iooperations.examples;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteStringToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos = new FileOutputStream("./test_one.txt");
			String inputStr = "Hi, please please write me to a file !";
			byte[] bytesArr = inputStr.getBytes();
			fos.write(bytesArr);
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
