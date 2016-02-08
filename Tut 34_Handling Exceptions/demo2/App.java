package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

    public static void main(String[] args) {
        File file = new File("test.txt");

        try {
        	// try to do this code and if this code throws an exception
        	// go to catch block and catch the exception
            FileReader fr = new FileReader(file);
            
            // This will not be executed if an exception is thrown.
            System.out.println("Continuing ....");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.toString());
        }

        System.out.println("Finished.");
    }

}