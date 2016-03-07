import java.io.Serializable;

public class Person implements Serializable {
    
    private static final long serialVersionUID = -1150098568783815480L;
    // generated following a warning
    
    // we do not want to serialize more fields than we have to as 
    // it wud be inefficient
    private transient int id;
    // we can prevent fields being serialized by using the transient kw
    // output wud be 0
    
    private String name;
    
    private static int count;

    public Person() {
        System.out.println("Default constructor");
    }
    
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
        
        System.out.println("Two-argument constructor");
        // deserializing doesn't run any constructor but serializing does
    }
    
    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "] Count is: " + count;
    }
}