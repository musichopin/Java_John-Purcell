import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(); // default size is 10
        // ArrayList template class implements an array that is expandable
        // we need to use the corresponding non-primitive type as template type for template classes
        
        // collection classes are grouped by the interfaces
        // so all the list objects implement the list interface

        // Adding
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        // Retrieving
        System.out.println(numbers.get(0));

        System.out.println("\nIteration #1: ");
        // Indexed for loop iteration - Iterating all the items in the list
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        
        System.out.println("\nIteration #2: ");
        // enhanced for loop iteration 
        for (Integer value: numbers) {
            System.out.println(value);
        }

        // Removing items (careful!)
        // removes from the end
        numbers.remove(numbers.size() - 1);

        // This is VERY slow
        // would slow down the code
        numbers.remove(0);
        
        // linkedlist recommended for removing items
        // from the beginning or middle of the list

        System.out.println("\nIteration #3: ");
        for (Integer value : numbers) {
            System.out.println(value);
        }

        // List interface ...
        List<String> values = new ArrayList<String>();
        // values variable can point to anything that implements the list interface
        // variable is pointing to an object of the type ArrayList
        // List is an interface not a class
        
        // values ---> ArrayList (ArrayList object) --- (implements) List
    }
}

/*
10

Iteration #1: 
10
100
40

Iteration #2: 
10
100
40

Iteration #3: 
100
*/