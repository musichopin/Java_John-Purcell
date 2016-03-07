public class App {

    public static void main(String[] args) {
        Camera cam1 = new Camera();
        cam1.setId(5);
        
        Car car1 = new Car();
        car1.setId(4);
        
        car1.run();
        
        //Machine machine1 = new Machine();
        // object reference variable cannot be created of abstract classes
    }

}
/*
Starting ignition...
Driving...
Switch off ignition.
*/