public class App {
    
    public static void main(String[] args) {
        // Animal: enum/enum class (also data type), animal: variable of Animal type
    	// DOG: special object of Animal type (enum constant)
        Animal animal = Animal.DOG; // variable declaration and assignment. 
        // Animal acts like both a data type and an enum class name
        // String animal = "DOG"; yazmaya göre avantajý enumun 
        // objectleri/constantlarý kýsýtlamasý ve valuelarý metodlar 
        // vasýtasýyla istediðimiz biçimde print etmektir
        
        switch(animal) {
        case CAT: 
        	// we didn't type Animal.CAT since we are switching on a particular variable of type Animal
            System.out.println("Cat");
            break;
        case DOG:
            System.out.println("Dog");
            break;
        case MOUSE:
        	System.out.println(Animal.MOUSE);
            break;
        default:
            break;

        }
        
        // rare and advanced cases:
        System.out.println(animal);
        System.out.println(Animal.DOG); // toString metodunu yazmaya gerek yok
        System.out.println("Enum name as a string: " + Animal.DOG.name());
        // name is a special method inherited from java.lang.enum to reach the 
        // actual object name/renum name (as a string) while toString() method is present
        
        System.out.println(Animal.DOG.getClass());
        
        System.out.println(Animal.DOG instanceof Animal);
        
        System.out.println(Animal.DOG instanceof Enum);
        // Animal enum is also instance of Enum 
        // the objects of child classes are instances of parent classes
        
        System.out.println(Animal.MOUSE.getName());
        
        Animal animal2 = Animal.valueOf("CAT");
        // alt: Animal animal2 = Animal.CAT; 
        System.out.println(animal2);
    }

}
/*
Dog
This animal is called: Fido
This animal is called: Fido
Enum name as a string: DOG
class Animal
true
true
Jerry
This animal is called: Fergus
*/