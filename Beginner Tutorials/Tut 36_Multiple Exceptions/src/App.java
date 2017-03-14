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
        	System.out.println("processing."); 
        	// exception yakalanmadan önce olduðu için print edilir
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
/*
processing.
retrieving.
Couldn't parse command file.
retrieving.
java.text.ParseException: Error in command list.
retrieving.
	at Test.run(Test.java:19)
	at App.main(App.java:27)
java.text.ParseException: Error in command list.
	at Test.run(Test.java:19)
	at App.main(App.java:34)
java.io.FileNotFoundException: File not found
	at Test.input(Test.java:25)
	at App.main(App.java:46)
*/