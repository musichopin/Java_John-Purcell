import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteObjects {

    public static void main(String[] args) {
        System.out.println("Writing objects...");
        
        // arrays are objects which makes them serializable and deserializable
        Person[] people = {new Person(1, "Sue"), new Person(99, "Mike"), new Person(7, "Bob")};
        // we are creating arrays of person objects
        // curly parenthesis have been used to initialize arrays of Person objects
        
        // we are creating an array list of person objects
        ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people)); // converting the array into list
        // alt: ArrayList<Person> peopleList = new ArrayList<Person>
        // (Arrays.asList(new Person(1, "Sue"), new Person(99, "Mike"), new Person(7, "Bob")));

        try (FileOutputStream fs = new FileOutputStream("test.ser"); ObjectOutputStream os = new ObjectOutputStream(fs)) {

            // Write (serialize) entire array
            os.writeObject(people);
            
            // Write (serialize) arraylist
            os.writeObject(peopleList);
            
            // Write (serialize) objects one by one (one object at a time)
            // we are telling the no of objects
            os.writeInt(peopleList.size()); 
            // with an array: os.writeInt(people.length); 
            // because length is a property
          
            for(Person person: peopleList) {
                os.writeObject(person);
            }
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
/*
Writing objects...
*/