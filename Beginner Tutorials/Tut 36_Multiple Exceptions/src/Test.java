import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException; // 2

public class Test {
	public void run() throws IOException, ParseException { // 3
		// one exception at a time is thrown
		
		// amacýmýz program yürütüldüðünde kodun baþarýlý olmasý
		// ve exception fýrlatmamak

		// throw new IOException();
		// IOException()'ýn run metodunun farklý bir yerinde olduðunu
		// düþünüyoruz
		// if statement, while loop vs ile yeri belirlenmiþ olabilir

		throw new ParseException("Error in command list.", 2); // 1
		// main method tarafýndan run metodu çaðrýldýðýndan 
		// ParseException fýrlatýldý (?). 
	}

	public void input() throws IOException, FileNotFoundException {
		throw new FileNotFoundException("File not found");
	}
}