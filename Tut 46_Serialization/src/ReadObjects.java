import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ReadObjects {

    
    public static void main(String[] args) {
        System.out.println("Reading objects...");

        try(FileInputStream fi = new FileInputStream("people.bin")) {
            
            ObjectInputStream os = new ObjectInputStream(fi);
            
            // we are reading two Person objects since
            // we wrote two Person objects as well
            Person person1 = (Person)os.readObject();
            Person person2 = (Person)os.readObject();
            // we are casting to particular type of object since
            // os.readObject(); returns a grandparent object (?)
            
            os.close();
            
            System.out.println(person1);
            System.out.println(person2);
            // tostring method called
            
        } catch (FileNotFoundException e) {
        	// fnfe wud be thrown if we cannot find this file
            e.printStackTrace();
        } catch (IOException e) {
        	// ioe wud be thrown if we cannot write to this file
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // thrown if readObject reads an object of a class that
        	// doesn't exist in the program
        	// (we do have Person class defined in same package)
            e.printStackTrace();
        }
        
    }

}