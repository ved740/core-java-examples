package iooperations.examples;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class MergeFiles {

	public static void main(String[] args) {
		Reader term1 = null;
		Reader term2 = null;
		Writer total = null;
		
		try {
			term1 = new FileReader("Term1.txt");
			term2 = new FileReader("Term2.txt");
			total = new FileWriter("Total.txt");
			
			int i = term1.read();
			int j = term2.read();
			boolean isReadable = false;
			
			while(i != -1) {
				if((char) i == ':') {
					isReadable = true;
				}
				
				if(isReadable) {
					if((char) i != ':' && (char)i != ' ' && (char) i != '\n') {
						System.out.println("marks " + (char) i);
						int t1 = i - 48;
						int t2 = j - 48;
						int ascii = 48 + t1 + t2;
						System.out.println("ascii "+ ascii);
						total.write(48 + t1 + t2);
					} else {
						total.write(i);
					}
					if((char) i == '\n') {
						isReadable = false;
					}
				} else {
					total.write(i);
				}
				
				i = term1.read();
				j = term2.read();
				
			}
			if(term1 != null) term1.close();
			if(term2 != null) term2.close();
			if(total != null) total.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
