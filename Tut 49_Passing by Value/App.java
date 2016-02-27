public class App {

    
    public static void main(String[] args) {
        App app = new App();
        
        //===========================================
        // PASSING PRIMITIVE TYPES (type int) BY VALUES
        
        int value = 7; // since int is primitive, variable value stores the value 7
        System.out.println("1. Value is: " + value);
        
        app.show(value);
           
        
        System.out.println("4. Value is: " + value);
        
        //===========================================
        // PASSING NON-PRIMITIVE TYPES (type Person) BY VALUES
        
        System.out.println();
        
        Person person = new Person("Bob"); 
        // person is a reference variable and it stores the address
        // of the Person object 
        
        System.out.println("1. Person is: " + person);
        
        app.show(person);
        
        System.out.println("4. Person is: " + person);
       // we pass by value (not reference) in java, so the variable change 
       // made in show method is not reflected back to the main method
       
        // while passing by reference address of a variable is kinda passed
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
    public void show(Person person) {
    // this person variable is a copy of person reference variable of 
    // an object in main method, but not itself. since person is of non-primitive type
    // it is like copy of the address of the house in a piece of paper
        System.out.println("2. Person is: " + person);
             
        person.setName("Sue");
        // we are setting the name for the same object
        // person = new Person("Mike");'dan sonra yazýlsaydý 
        // yeni object yaratýlmýþ olacaðý için main method'a etki etmezdi
        
        person = new Person("Mike");
        // we are erasing the address on paper and writing down 
        // new address of a new house object. 
        // and new address is the address of the Person object
                
        System.out.println("3. Person is: " + person);
        
    }
    
    
}