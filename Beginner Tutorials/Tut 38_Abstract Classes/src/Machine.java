public abstract class Machine {
	// abstract classes are used when the super/base class is not gonna do
	// anything
	// with the abstract method leaving it with no body
	
	private int id;
	// subclasses have id in common
	// but private kw is not visible in subclasses

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public abstract void start();
	// abstract methods are like declaration of methods in an interface
	// abstract methods force child classes to handle them	

	public abstract void doStuff();

	public abstract void shutdown();

	public void run() {
		start();
		doStuff();
		shutdown();
	}
}
