package demo2;

// second method is implementing Runnable interface 
// and passing to the constructor of the Thread class
class Runner implements Runnable {
	//Runnable interface has just method in it
	

    @Override
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("Hello: " + i);
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
    }
    
}


public class Application {

    
    public static void main(String[] args) {
    	
        Thread thread1 = new Thread(new Runner());
        // alt:
        // Runner runner1 = new Runner(); 
    	//  Thread thread1 = new Thread(runner1);
        
        Thread thread2 = new Thread(new Runner());
        // we are passing an instance/object of the Runner class to the constructor
        // to the constructor of Thread class
        
        thread1.start();
        thread2.start();
    }

}
/*
Hello: 0
Hello: 0
Hello: 1
Hello: 1
Hello: 2
Hello: 2
Hello: 3
Hello: 3
Hello: 4
Hello: 4
*/