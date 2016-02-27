class Thing {
    public final static int LUCKY_NUMBER = 7;
    // final is JAVA's constant
    // we've gotta initialize/assign constants 
    
    public String name; // every separate object of the type Thing gets its own copy
    public static String description; // class variables belong to the class
    
    public static int count = 0;
    
    public int id;
    
    public Thing() {
        
        id = count; // sağdaki count, soldaki id'yi etkiler
        
        count++;
    }
    
    public void showName() {
        System.out.println("Object id: " + id + ", " + description + ": " + name + ", count: " + count);
        // count, static olduğu için her zaman son değer olan 2 olarak output edilir
        // instance methods can access static variables
    }
    
    public static void showInfo() {
        System.out.println(description);
        // Won't work: System.out.println(name);
        // static methods cannot call instance variables without creating instances
    }
}


public class Java {

    public static void main(String[] args) {
        
        Thing.description = "I am a thing";
        
        Thing.showInfo();
        
        System.out.println("Before creating objects, count is: " + Thing.count);
        
        Thing thing1 = new Thing();
        Thing thing2 = new Thing();
        
        System.out.println("After creating objects, count is: " + Thing.count);
        
        thing1.name = "Bob";
        thing2.name = "Sue";
        
        thing1.showName();
        thing2.showName();
        
        System.out.println(Math.PI); 
        // Math: class, PI: constant method
        
        System.out.println(Thing.LUCKY_NUMBER);
        // constants are declared via UPPERCASE
    }

}
