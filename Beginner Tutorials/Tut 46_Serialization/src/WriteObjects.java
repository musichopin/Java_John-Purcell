import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//normally writing and reading would be on the same program
public class WriteObjects {
	// but it is possible to have more than one main method in the same program
	// in case we indicate which one starts first
	public static void main(String[] args) {
		System.out.println("Writing objects...");

		Person mike = new Person(543, "Mike");
		Person sue = new Person(123, "Sue");
		
		System.out.println(mike);
		System.out.println(sue);

		// we are gonna write objects into a file in binary format
		try (FileOutputStream fs = new FileOutputStream("people.bin")) {
			// we are using try with resources because close method
			// is automatically called by fileoutputstream object
			// fileoutputstream class streams data to a file

			// one object is passed into another
			ObjectOutputStream os = new ObjectOutputStream(fs);
			// alt1: try(ObjectOutputStream os = new ObjectOutputStream(new
			// FileOutputStream("people.bin")))
			// alt2: try(FileOutputStream fs = new
			// FileOutputStream("people.bin");
			// ObjectOutputStream os = new ObjectOutputStream(fs))

			// we are using ObjectOutputStream object to write Person objects
			// into a file
			os.writeObject(mike);
			os.writeObject(sue);

			os.close();
			// if closed ObjectOutputStream object outside of try catch method
			// we wud need to handle other types of exception
			// which wud make it nested and even more awkward
		} catch (FileNotFoundException e) {
			// fnfe wud be thrown if we cannot create this file
			e.printStackTrace();
			// normally we need to handle this exceptions gracefully
			// by outputing a message or sth
		} catch (IOException e) {
			// ioe wud be thrown if we cannot write to this file
			e.printStackTrace();
		}

	}

}
/*
Writing objects...
Person [id=543, name=Mike]
Person [id=123, name=Sue]
*/