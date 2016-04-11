// we preferred enum instead of writing variables as public static final 
// (with upper case; static makes variables belong to the class which saves memory 
// rather than having instances of these constants for each object)
// the reason is firstly enum does restrict the objects 
// in switch sta as opposed to constant variables
// and secondly it becomes secured to create a 
// variable (animal) of Animal type through suggestion

// whilist classes in java implicitly inherit from the object super class
// Animal enum inherits from java.lang.enum
public enum Animal { // kws in lower case
	CAT("Fergus"), DOG("Fido"), MOUSE("Jerry");
	// Animal: enum/enum class
	// CAT: enum constant, object
	// "Fergus": value, argument
	// even though because it is enum type we cannot make "new Animal" 
	// we can still pass arguments into the constructor through objects

	private String name;

	Animal(String name) {
		// constructor of enum can be declared 
		// constructor can only be default or private in enum 
		// as opposed to class constructors being public, private, protected and default
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "This animal is called: " + name;
	}
}
