import java.io.Serializable;
// serialization: taking the object and turning into binary data
// deserialization: taking the data and turning back into object

// class becomes serializable by implementing the serializable interface
public class Person implements Serializable {

	private static final long serialVersionUID = 4801633306273802062L;

	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
}