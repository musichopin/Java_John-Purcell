public class Machine {

	protected String name = "Machine Type 1";  
	// protected variables are accessed within the same package and from subclasses
	// do not override variables, but methods

	public void start() {
		System.out.println("Machine started.");
	}

	public void stop() {
		System.out.println("Machine stopped.");
	}
}