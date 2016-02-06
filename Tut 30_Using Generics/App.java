
import java.util.ArrayList;
import java.util.HashMap;

class Animal {
    
}

public class App {

    public static void main(String[] args) {
    	
    	// generic class is a class that can work with other objects
    	// and you specify what type of object it can work with
    	// when you instantiate the object
        
        /////////////////// Before Java 5 ////////////////////////
        ArrayList list = new ArrayList();
        
        list.add("apple");
        list.add("banana");
        list.add("orange");
        
        String fruit = (String)list.get(1);
        // we are down casting the object to string
        
        System.out.println(fruit);
        
        /////////////// ***Modern style*** /////////////////// what matters for us
        
        // we can iterate through an array list through for each loop        
        ArrayList<String> strings = new ArrayList<String>();
        
        strings.add("cat");
        strings.add("dog");
        strings.add("alligator");
        
        String animal = strings.get(1);
        
        System.out.println(animal);
        
        
        ///////////// There can be more than one type argument ////////////////////
        
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        
        
        //////////// Java 7 style /////////////////////////////////
        
        ArrayList<Animal> someList = new ArrayList<>();
        // it works with any class 
    }

}