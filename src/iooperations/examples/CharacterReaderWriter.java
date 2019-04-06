package iooperations.examples;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharacterReaderWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = null;
		Writer writer = null;
		
		try {
			reader = new FileReader("ReaderTest.txt");
			writer = new FileWriter("WriterTest.txt");
			
			int i = reader.read();
			while (i != -1) {
				writer.write(i);
				i = reader.read();
			}
			if(reader != null) reader.close();
			if(writer != null) writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
