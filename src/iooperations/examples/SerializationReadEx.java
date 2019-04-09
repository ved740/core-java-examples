package iooperations.examples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class SerializationReadEx {
	
	public static void main(String[] args) {
		
		try (InputStream inputFile = new FileInputStream("serial-output.bin")) {
			ObjectInputStream ois = new ObjectInputStream(inputFile);
			StudentIO1 stIo1 = (StudentIO1) ois.readObject();
			System.out.println(stIo1);
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
