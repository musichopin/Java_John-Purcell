import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person { // we are creating our own comparator class
    private int id;
    private String name;
    
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() {
        return id + ": " + name;
    }
}

class StringLengthComparator implements Comparator<String> {
	// Comparator is a template type
	
    @Override
    public int compare(String s1, String s2) {
    	// compare is gonna be supplied with the objects in our list, two at a time

        int len1 = s1.length();
        int len2 = s2.length();
        
        if(len1 > len2) {
            return 1; // we want len1 to sort further up in the list
        }
        else if(len1 < len2) {
            return -1;
        }
        
        return 0;
    }
}

class ReverseAlphabeticalComparator implements Comparator<String> {
	
	
    @Override
    public int compare(String s1, String s2) {
        return -s1.compareTo(s2); 
        // returns -1 if s1 is greater than (alphabetically later) s2
        // short version of if statement
        // but still we don't need to create a new class (see: line 104)
    }
}

public class App {

    
    public static void main(String[] args) {
        
        ////////////////////// Sorting Strings ////////////////////////////////
        List<String> animals = new ArrayList<String>();
        
        animals.add("tiger");
        animals.add("lion");
        animals.add("cat");
        animals.add("snake");
        animals.add("mongoose");
        animals.add("elephant");
        
        // Collections.sort(animals, new StringLengthComparator());
        
        // Collections.sort(animals); sorts in alphabetical order
        Collections.sort(animals, new ReverseAlphabeticalComparator());
        // we are creating a new instance of the ReverseAlphabeticalComparator
        // and passing to collections.sort
        
        // we are using a static method name from the collections class
        
        for(String animal: animals) {
            System.out.println(animal);
        }
    
        ////////////////////// Sorting Numbers ////////////////////////////////
        List<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(3);
        numbers.add(36);
        numbers.add(73);
        numbers.add(40);
        numbers.add(1);
        
        Collections.sort(numbers, new Comparator<Integer>() { 
        	// we don't have to create a class for the comparison
        	// derived from: Collections.sort(numbers, new Comparator<Integer>() { ... })
            public int compare(Integer num1, Integer num2) {
                return -num1.compareTo(num2); // sorts the numbers in reverse numerical order
            }
        });
        
        for(Integer number: numbers) {
            System.out.println(number);
        }
        
        ////////////////////// Sorting arbitary objects ////////////////////////////////
        
        List<Person> people = new ArrayList<Person>();
        
        people.add(new Person(1, "Joe")); // creates an object, calls Person class and returns toString method
        people.add(new Person(3, "Bob"));
        people.add(new Person(4, "Clare"));
        people.add(new Person(2, "Sue"));
        
        for(Person person: people) { // people: list variable, Person: class, person: for-each loop variable
            System.out.println(person); // prints without order
        }
        
        // Sort in order of ID
        Collections.sort(people, new Comparator<Person>() {
        	// Collections.sort(people); didn't work
            public int compare(Person p1, Person p2) {

                if(p1.getId() > p2.getId()) {
                    return 1;
                }
                else if(p1.getId() < p2.getId()) {
                    return -1;
                }
                
                return 0;
            }
        });
        
        System.out.println();
        
        for(Person person: people) { 
            System.out.println(person);
        }
        
        // Sort in order of name, alphabetical
        Collections.sort(people, new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
        
        System.out.println();
        
        for(Person person: people) {
            System.out.println(person);
        }
        
    }

}

/*
tiger
snake
mongoose
lion
elephant
cat
73
40
36
3
1
1: Joe
3: Bob
4: Clare
2: Sue

1: Joe
2: Sue
3: Bob
4: Clare

3: Bob
4: Clare
1: Joe
2: Sue
*/