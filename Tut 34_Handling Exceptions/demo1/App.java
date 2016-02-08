package demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		// filenotfoundexception was thrown to the main method
		// when an exception is thrown out of the main method
		// we get a stack trace in red color

		// stack trace yukarýdan aþaðý doðru okunmalýdýr

		File file = new File("test.txt"); // File class
		
		FileReader fr = new FileReader(file); // FileReader class
		// FileReader, Scanner alternatifidir
		// we are passing File object to the constructor
	}

}