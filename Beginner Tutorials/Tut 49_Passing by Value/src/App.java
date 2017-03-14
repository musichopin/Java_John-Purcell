public class App {

//    ***pass by value'da 3 þey önem taþýr:
//	- complex type yaratýlmasý (array veya class; string deðil)
//	- bu complex type'ýn baþka bir complex type'a (array veya class) assign edilmesi, yani arrayin 
//	bir elemaný int'e veya string string return eden class'ýn metoduna assign edilmiþ olmamalý
//	- yapýlan deðiþikliðin diðerine etkimesi için reassign edip new kw veya null kullanýlmamasý
//	tüm bu aþamalardan sonra yapýlan deðiþiklikler karþýlýklýdýr. yani assign eden de edilen de birbirini etkiler***
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
//      ***Both references point to the original objects or values***
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
        
        System.out.println("6. Person is: " + person);
       // we pass by copy (not reference) in java, when passed by copy
       // the method receives a copy of the variable, when passed by 
       // reference the method receives a reference to the original object 

        
        //===========================================
        // PASSING primitives wrapped in objects (object variables):
        
        System.out.println();
        
        int[] original = {10, 20, 30};
        System.out.println("Original before: " + original[0]);
        incrementValue(original);
        System.out.println("Original after: " + original[0] + "\n");
//      **array is a complex object, the values referenced by the array is still primitive**
//   	although we are passing a copy of the array, new array is still referencing the 
//      original values that are stored in the outer scope
        
        int[] origin = {1, 2, 3};
        System.out.println("Original before: " + origin[0]);
        int[] new_array = origin;
        System.out.println("2nd array: " + new_array[0]);
        origin[0]++;
        System.out.println("2nd array after: " + new_array[0] + "\n");
        // ***new_array is effected from changes within origin array***
        
        int[] orig = {100, 200, 300};
        System.out.println("Original before: " + orig[0]);
        int new_int = orig[0];
        System.out.println("int: " + new_int);
        orig[0]++;
        System.out.println("int after: " + new_int);
        // ***int doesn't change since it is of primitive type
        // (Class new_class = orig[0] olsaydý deðiþim olurdu)***

        
        //===========================================
        // PASSING String Values (object variables, but a special case) 
        
        // **String data type is contrary to the complex objects**
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
    public void show(Person person) { // Person person = person olarak düþün (yeni object oluþmaz)
    // this person variable is a copy of person reference variable of 
    // an object in main method, but not itself. since person is of non-primitive type
    // ***it is like copy of the address of the same common house in a piece of paper***
        System.out.println("2. Person is: " + person);
             
        person.setName("Sue");
        // ***even though the passed person ref variable from the main method was
        // a copy of the original, the copy stills point to the same object 
        // that's why we are setting the name for the same object
        // person = new Person("Mike");'dan sonra yazýlsaydý 
        // yeni object yaratýlmýþ olacaðý için main method'a etki etmezdi***
        
        person = new Person("Mike");
        // ***(null'a da eþitlense ayný þey olacaktý ve 1. person etkilenmeyecekti)
        // we are erasing the address on paper and writing down 
        // new address of a new house object. 
        // and new address is the address of the new Person object***
                
        System.out.println("3. Person is: " + person);
        
//       ***metoda argumentte object pass etmekle ayný anlamda***
        Person person2 = person;
        
        System.out.println("4. Person is: " + person2);
        
        person2.setName("Zuzi");
//     ***person.setName("Zuzi") de denseydi 5. person Zuzi olurdu.
//        ayrýca, person = new Person("Mike"); diye yeni object yaratýlmamýþ olsaydý 
//        6. Person da Zuzi olurdu.***
        
        System.out.println("5. Person is: " + person2);
        
    }
    
    static void incrementValue(int[] inMethod) {
//    	***"inMethod = new int[]{10, 20, 30};" denseydi 
//    	original arraye etkimeyecekti***
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
4. Person is: Person [name=Mike]
5. Person is: Person [name=Zuzi]
6. Person is: Person [name=Sue]

Original before: 10
In method: 11
Original after: 11

Original before: 1
2nd array: 1
2nd array after: 2

Original before: 100
int: 100
int after: 100

Original before: Original
In method: New!
Original after: Original
*/