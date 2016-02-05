import world.Plant;

/*
 * private --- only within same class
 * no modifier --- same package only
 * protected --- subclass, and same package
 * public --- from anywhere
 */

public class App {
	// class prefixleri public, final, abstract veya no modifier olabilir
	// public class file dýþýndan visible demek olup bir file'da sadece 1 tane public class bulunmalýdýr

    public static void main(String[] args) {
        Plant plant = new Plant();
        
        System.out.println(plant.name);
        
        System.out.println(plant.ID);
        
        // Won't work --- type is private
        //System.out.println(plant.type);
        
        // size is protected; App is not in the same package as Plant.
        // Won't work
        // System.out.println(plant.size);
        
        // Won't work; App and Plant in different packages, height has package-level visibility.
        //System.out.println(plant.height);

    }

}