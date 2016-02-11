public class Camera extends Machine {
	// inheritance is stronger statement than interface
	// "camera is a machine"
	// that is why only one inheritance is allowed per class

	// abstract methods could be implemented in subclasses of superclass
	@Override
	public void start() {
		System.out.println("Starting camera.");
	}
	// start metodu implement edilmeseydi
	// camera class abstract olacaktý

	@Override
	public void doStuff() {
		System.out.println("Taking a photo");

	}

	@Override
	public void shutdown() {
		System.out.println("Shutting down the camera.");

	}

}