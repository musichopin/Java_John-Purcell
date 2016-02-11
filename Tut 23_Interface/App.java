public class App {
    
    public static void main(String[] args) {
        
        Machine mach1 = new Machine();
        // Machine: class | mach1: object reference variable 
        // new Machine(): machine object/object of machine type
        mach1.start();
        
        Person person1 = new Person("Bob");
        person1.greet();
        
        // polymorphism yapýlmýþ
        Info info1 = new Machine();
        // if machine class didnt implement info interface we wouldnt do this
        // info1 is a variable of type info pointing to an object of type machine (machine object)
        info1.showInfo();
        // we can only access showInfo() method which is defined in interface
        // besides some object class methods
        
        Info info2 = person1;
        // person1 is a reference to a person object (object of type person)
        // point info2 to the same thing which person1 refers to
        info2.showInfo();
        
        System.out.println();
        
        outputInfo(mach1); // machine class implements info interface
        outputInfo(person1); // person class implements info interface
        
        // we can pass any objects to the method outputInfo that implements info interface
        // and within the outputInfo method we can access any method that is defined
        // in the info interface
    }
    
    private static void outputInfo(Info abc) {
    	// we made it static so that it could be directly called by a static method
    	// this method takes a parameter (variable) of type Info
        abc.showInfo();
    }

}
