package iooperations.examples;

import java.io.*;
public class BufferedReaderEx {
	public static void main(String args[]) throws Exception {
		char c;
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		do{
			c = (char)obj.read();
			System.out.print(c);
		}while(c != '\'');	
	}
}