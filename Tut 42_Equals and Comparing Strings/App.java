class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }

    @Override
    public int hashCode() { 
    	// hashcode'u return eder
    	// framework konusu
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override 
    // we are overriding the .equals method so that we 
    // count them as equals
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    
}

public class App {

    public static void main(String[] args) {
    	// package + object class + hash code (unique id) print edilir
    	// object class tostring metoda sahip olsaydý
    	// tostring metod print edilirdi (?)
    	System.out.println(new Object());
    	/* alt:
    	 * Object x = new Object();
    	 *	System.out.println(x);
    	 */

        Person person1 = new Person(5, "Bob");
        Person person2 = new Person(5, "Bob");
        
        System.out.println(new Person(5, "Bob"));
        System.out.println(person1); // ayný
        // Person class'da tostring method olduðundan 
        // tostring metod call edilir
        
        System.out.println(person1 == person2); 
        // == is used to tell whether two reference variables point 
    	// to the same object in memory
    	// Person objects are different
        
        // .equals method is used to compare object in terms of meaning/value
        // .equals method is inherited from the object super class 
        // person class has overridden the method to use here
        System.out.println(person1.equals(person2));
        
        person1 = person2;
        // now reference variables point to the same object
        System.out.println(person1 == person2); 
        
        System.out.println();
        
        Double value1 = 7.2;
        Double value2 = 7.2;
        
        System.out.println(value1==value2); 
        // surprising
        
        System.out.println(value1.equals(value2));
        
        Integer number1 = 6;
        Integer number2 = 6;
        
        System.out.println(number1==number2); 
        System.out.println(number1.equals(number2));
        
        System.out.println();
        
        String text5 = new String("Hello");
        String text6 = new String("Hello");
        System.out.println(text5==text6);  
        System.out.println(text5.equals(text6));  
        
        String text3 = "Hello";
        String text4 = "Hello";
        System.out.println(text3==text4); 
        // current version of 
        // java points these two variables to the same object in memory
        
        System.out.println(text3.equals(text4));
        
        String text1 = "Hello";
        String text2 = "Hellodfadf".substring(0, 5);
        
        System.out.println(text2);
        
        System.out.println(text1==text2); 
        System.out.println(text1.equals(text2));
    }

}