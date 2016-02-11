public class Machine implements Info {
	// a class can extends only one class, whereas it can implement as many interfaces as possible
    
    private int id = 7;
    
    public void start() {
        System.out.println("Machine started.");
    }
    
    public void showInfo() { // we are forced to write the method we implement
        System.out.println("Machine ID is: " + id);
    }
    // showinfo metodu implement edilmeseydi
 	// machine class abstract olacaktý
}