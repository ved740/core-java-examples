package iooperations.examples;

import java.io.RandomAccessFile;

public class RandomAccessFileEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		RandomAccessFile randomFile = new RandomAccessFile("random.txt", "rw");
		randomFile.writeUTF("Writing");
		System.out.println("Current Position : " + randomFile.getFilePointer());
		randomFile.seek(0);
		System.out.println(randomFile.readUTF());
		System.out.println("Current Position : " + randomFile.getFilePointer());
		randomFile.close();

	}

}
