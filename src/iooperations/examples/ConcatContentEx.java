package iooperations.examples;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ConcatContentEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream ip1 = new FileInputStream("Term1.txt");
		InputStream ip2 = new FileInputStream("Term2.txt");
		
		OutputStream os = new FileOutputStream("Output.txt");
		int i1 = ip1.read();
		while(i1 != -1) {
			os.write(i1);
			i1 = ip1.read();
		}
		os.write('\n');
		int i2 = ip2.read();
		while(i2 != -1) {
			os.write(i2);
			i2 = ip2.read();
		}
		
		ip1.close();
		ip2.close();
		os.close();		

	}

}
