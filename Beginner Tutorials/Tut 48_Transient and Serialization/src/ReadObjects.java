import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

    public static void main(String[] args) {
        System.out.println("Reading objects...");
        
        try (ObjectInputStream os = new ObjectInputStream(new FileInputStream("test.ser"))) {

            Person person = (Person)os.readObject();
            System.out.println(person);
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
/*
Reading objects...
Person [id=0, name=Bob] Count is: 0
*/