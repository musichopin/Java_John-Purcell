class Machine {
    private String name;
    private int code;
    
    public Machine() { // constructors have upper case letters
        this("Arnie", 0);
        // we can call constructors from within other constructors with this kw
        // call to the constructor must be the first line in another constructor 
                
        System.out.println("Constructor running!");
    }
    
    public Machine(String name) {
        this(name, 0);
        
        System.out.println("Second constructor running");
        // No longer need following line, since we're using the other constructor above.
        //this.name = name;
    }
    
    public Machine(String name, int code) {
        System.out.println("Third constructor running");
        this.name = name; // kind of set method
        this.code = code;
    }
}

public class java {
    public static void main(String[] args) {
        Machine machine1 = new Machine();

        Machine machine2 = new Machine("Bertie");
        
        Machine machine3 = new Machine("Chalky", 7);
      
      	machine3 = new Machine("Chalky", 7); 
      
      	new Machine("Chalky", 7);
      
      	// aynı constructor tekrar kullanılırsa kısa yoldan yazılabilir
    }

}

 
