package iooperations.examples;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadEmptyFile {
    public static void main(String[] args) {
         try{    
             FileInputStream fis = new FileInputStream("text.txt");
             int i = fis.read();
             System.out.println(i);
         } catch (IOException ioe) {
             System.out.println("There is an error occurred.");
         }
    }
}
