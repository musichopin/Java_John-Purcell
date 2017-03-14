import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App2 {

    public static void main(String[] args) {
        File file = new File("test.txt");
     // String file = "test.txt"; yazýnca hata vermedi

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        	// we are passing filereader object to the constructor of bufferedreader
        	// bu yöntemle memory leak yapmaz ve close etmeyiz
        	
            String line;
            
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            /*
           	alt:
           	line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
             */
        } catch (FileNotFoundException e) {
            System.out.println("Can't find file " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file " + file.toString());
        }

    }

}
/*
This is line one
This is line two
Last line.
*/