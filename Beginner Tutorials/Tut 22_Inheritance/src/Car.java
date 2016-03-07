public class Car extends Machine { 
	// car is a child/sub class of machine
	// machine is the parent/super class of car
	// car derives from/inherits from the machine
	// car is a machine	

	@Override // it checks if the method name exists
	public void start() { // rick click + source is easier way to create overridden methods
		System.out.println("Car started");
	}

	public void wipeWindShield() { // new methods could be written for sub classes
		System.out.println("Wiping windshield");
	}

	public void showInfo() {
		System.out.println("Car name: " + name);
	}
}
