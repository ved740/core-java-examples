package iooperations.examples;

import java.io.*;
public class Test {
	public static void main(String args[]) throws Exception {
		RandomAccessFile randomFile = new RandomAccessFile("output.txt", "r");
		randomFile.seek(0); //line 5
		randomFile.writeBytes("Test"); //line 6
		System.out.println("Current position:" + randomFile.getFilePointer());
		randomFile.close();
	}
}
