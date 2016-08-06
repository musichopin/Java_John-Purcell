class Machine {
    public void start() {
        System.out.println("Machine started.");
    }
}

class Camera extends Machine {
    public void start() {
        System.out.println("Camera started.");
    }
    
    public void snap() {
        System.out.println("Photo taken.");
    }
}


public class App {
    public static void main(String[] args) {

        Machine machine1 = new Machine();
        Camera camera1 = new Camera();
        
        machine1.start();
        camera1.start();
        camera1.snap();
        
        // Upcasting and downcasting is a thing to do with variables
        // in polymorphism we wud use an object reference variable of a child class type
        // whereas we wud expect an object reference variable of a parent class type
        
        // Upcasting (polymorphism) -> 1+1 kuralýný uygula
        Machine machine2 = camera1; // saðdaki Camera yükseltgeniyor
        // alt: Machine machine2 = new Camera();
        // actual object machine2 variable refers to is camera object
        
        machine2.start();
       // error: machine2.snap();
       // variable type decides what methods are available whereas 
       // type of the object that variable refers to determines what actual methods are called

        // Downcasting requires confirmation and relatively unsafe (2+1 kuralýný uygula)
        Machine machine3 = new Camera(); 
        Camera camera2 = (Camera)machine3; // saðdaki Machine indirgeniyor
        camera2.start();
//     alt:
//     ((Camera)machine3).start();
        camera2.snap();
//     machine3 is still reusable after downcasting:
//     machine3.start();
        
        // Doesn't work bc the actual object is a machine 
        // and objects cannot be changed
        // --- runtime error.
        Machine machine4 = new Machine();
        // Camera camera3 = (Camera)machine4;
        // camera3.start();
        // camera3.snap();
    }

}
/*
Machine started.
Camera started.
Photo taken.
Camera started.
Camera started.
Photo taken.
*/