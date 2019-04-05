package iooperations.examples;

import java.io.*;
public class WriteAndRead {
	public static void main(String args[]) throws Exception {
		FileOutputStream outFile = new FileOutputStream("output.txt");
		String data = "Hello there!";
		byte bArray[] = data.getBytes();
		outFile.write(bArray);
		outFile.close();
		
		FileInputStream inFile = new FileInputStream("output.txt");
		int i = inFile.read();
		System.out.println((char)i);
		inFile.close();	
	}
}
