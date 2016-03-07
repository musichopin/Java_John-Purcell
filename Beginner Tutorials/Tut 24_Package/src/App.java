// package hem düzen verir 
// hem de farklý package'de bulunan iki class isminin ayný olmasýna müsaade eder
import ocean.Fish;
// we are importing fish class from the ocean package
// ocean package'i nitelerken fish class'ý niteler
// package windows'daki folder gibidir, class ise file.
// windows explorer'daki slashýn aksine nokta ile ayrýlýr
import ocean.plants.Seaweed;
// farklý package'de bulunan class çaðrýlacak ise public bile olsa import edilmek zorunda
// import ocean.*; -> import any class from the package ocean

public class App {
    
    public static void main(String[] args) {
        Fish fish = new Fish();
        Seaweed weed = new Seaweed();
    }

}
