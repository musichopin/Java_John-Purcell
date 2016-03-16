public class App {

    
    public static void main(String[] args) {
        App app = new App();
        
        //===========================================
        // PASSING PRIMITIVE TYPES (type int) BY VALUES
        
        int value = 7;
        // since int is primitive, variable value stores the value 7
        // rather than point to like an object
        System.out.println("1. Value is: " + value);
        
        app.show(value);
           
        
        System.out.println("4. Value is: " + value);
        
        
        

        //===========================================
        // PASSING NON-PRIMITIVE TYPES (object variables) BY VALUES        
        
//      A reference variable points to a location/object in memory
//      When a new variable is passed to a function, a new reference is always created 
//      Both references point to the original objects or values
//      If we change the object with the new variable, former variable's object 
//      is also changed for point out to and sharing the same object
        
        System.out.println();
        
        Person person = new Person("Bob"); 
        // person is a reference variable and it stores the address
        // of the Person object 
        
        System.out.println("1. Person is: " + person);
        
        app.show(person);
        // app.show(new Person("Bob")); denseydi 
        // "Bob, Bob, Mike, Bob" olarak print edilecekti
        // zira, show metodundaki argument eþitliðin soluna geçecek ve 
        // metPerson person = new Person("Bob"); olacaktý
        
        System.out.println("4. Person is: " + person);
       // we pass by copy (not reference) in java, when passed by copy
       // the method receives a copy of the variable, when passed by 
       // reference the method receives a reference to the original object 

        
        //===========================================
        // PASSING primitives wrapped in objects (object variables):
        
        System.out.println();
        
        int[] original = {10, 20, 30};
        System.out.println("Original before: " + original[0]);
        incrementValue(original);
        System.out.println("Original after: " + original[0]);
//     array is a complex object, the values referenced by the array is still primitive
//  	although we are passing a copy of the array, new array is still referencing the 
//     original values that are stored in the outer scope

        
        //===========================================
        // PASSING String Values (object variables, but a special case) 
        
        // String data type is contrary to the complex objects
        // String variables are immutable, once declared they cannot change
        // a copy of the entire String is created when passed to a method
        // and it is detached from the original value outside the method
        
        System.out.println();
        
        String original2 = "Original";
        System.out.println("Original before: " + original2);
        changeString(original2);
        System.out.println("Original after: " + original2);

    }
    
    public void show(int value) { 
    	// parameter value is a copy of argument value in main method, 
    	// but not itself. 
    	// scope of variable value in this parameter is 
    	// within this curly brackets
    	
        System.out.println("2. Value is: " + value);
        
        value = 8;
        
        System.out.println("3. Value is: " + value);
    }
    
    // method overloading: method name can remain the same 
    // with parameter types and/or numbers being changed
    public void show(Person person) { // Person person = new Person() olarak düþün
    // this person variable is a copy of person reference variable of 
    // an object in main method, but not itself. since person is of non-primitive type
    // it is like copy of the address of the house in a piece of paper
        System.out.println("2. Person is: " + person);
             
        person.setName("Sue");
        // even though the passed person ref variable from the main method was
        // a copy of the original, the copy stills point to the same object 
        // that's why we are setting the name for the same object
        // person = new Person("Mike");'dan sonra yazýlsaydý 
        // yeni object yaratýlmýþ olacaðý için main method'a etki etmezdi
        
        person = new Person("Mike");
        // we are erasing the address on paper and writing down 
        // new address of a new house object. 
        // and new address is the address of the new Person object
                
        System.out.println("3. Person is: " + person);
        
    }
    
    static void incrementValue(int[] inMethod) {
    	inMethod [0] ++;
    	System.out.println("In method: " + inMethod[0]);
    }
    
    static void changeString(String inMethod) {
 	   inMethod = "New!";
 	   System.out.println("In method: " + inMethod);
    }
    
}
/*
1. Value is: 7
2. Value is: 7
3. Value is: 8
4. Value is: 7

1. Person is: Person [name=Bob]
2. Person is: Person [name=Bob]
3. Person is: Person [name=Mike]
4. Person is: Person [name=Sue]

Original before: 10
In method: 11
Original after: 11

Original before: Original
In method: New!
Original after: Original
*/