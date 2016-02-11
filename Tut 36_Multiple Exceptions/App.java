import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class App {

    public static void main(String[] args)  {
        Test test = new Test();
        
        // we are not gonna add "throws declaration"
        // instead we are gonna surround with "try catch blocks"
        
        // Multiple catch blocks
        try {
            test.run();
        } catch (IOException e) { // e: variable
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Couldn't parse command file.");
            // since we catch parseexception we run this code
        }
        
        // Try multi-catch (Java 7+ only)
        try {
            test.run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        // Using polymorphism to catch the parent of all exceptions
        try {
            test.run();
        } catch (Exception e) {
        	// since all exceptions derive from the parents class exception
        	// it will catch any exception
            e.printStackTrace();
        } 
        
        // Important to catch exceptions in the right order!
        // IOException cannot come first, because it's the parent
        // of FileNotFoundException, so would catch both exceptions
        // in this case. (if statementdaki hiyerarþiye benzer)
        try {
            test.input();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    
    }

}