public class App {

	public static void main(String[] args) {
		Machine mach1 = new Machine();

		mach1.start();
		mach1.stop();

		Car car1 = new Car();

		car1.start();
		car1.wipeWindShield();
		car1.showInfo();
		car1.stop();

	}

}
/*
Machine started.
Machine stopped.
Car started
Wiping windshield
Car name: Machine Type 1
Machine stopped.
*/