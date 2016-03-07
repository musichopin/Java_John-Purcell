import java.util.Scanner;

public class Java {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a command: ");
		String text = input.nextLine();
		switch (text) {
		case "start":
			System.out.println("Machine started!");
			break; // if statementın aksine break komutu kullanılmalı
		case "stop":
			System.out.println("Machine stopped.");
			break;
		default: // else statement gibidir.
			// default en altta bulunmalıdır
			System.out.println("Command not recognized");
		}
	}
}
/*
Please enter a command: 
// start entered
Machine started!
*/