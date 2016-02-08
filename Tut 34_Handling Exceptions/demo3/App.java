package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

    public static void main(String[] args) {
    	// openFile metodunda try catch block kullanýlsaydý 
    	// main metodda excepting handlinge gerek kalmayacaktý
        try {
            openFile();
        } catch (FileNotFoundException e) {
            // PS. This message is too vague : )
            System.out.println("Could not open file");
            // stack trace yazmak (e.printStackTrace();) user için kaba olurmuþ
        }
    }
    
    // main method içerisinde object yaratmamak için static dendi
    public static void openFile() throws FileNotFoundException {
        File file = new File("test.txt");

        FileReader fr = new FileReader(file);

    }

}