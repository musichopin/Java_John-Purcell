import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class App {
	
    
    public static void main(String[] args) {
        File file = new File("test.txt");
        // String file = "test.txt"; yazýnca hata vermedi
         
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
           br.write("This is line one");
           br.newLine();
           br.write("This is line two");
           br.newLine();
           br.write("Last line.");
        } catch (IOException e) {
            System.out.println("Unable to write file " + file.toString());
        }
        
        // WE MAY WANT TO PRINT WHAT WE WROTE:
//        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//        	// we are passing filereader object to the constructor of bufferedreader
//        	// bu yöntemle memory leak yapmaz ve close etmeyiz
//        	
//            String line;
//            
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//            /*
//           	alt:
//           	line = br.readLine();
//            while (line != null) {
//                System.out.println(line);
//                line = br.readLine();
//            }
//             */
//        } catch (FileNotFoundException e) {
//            System.out.println("Can't find file " + file.toString());
//        } catch (IOException e) {
//            System.out.println("Unable to read file " + file.toString());
//        }
        
 
    }

}