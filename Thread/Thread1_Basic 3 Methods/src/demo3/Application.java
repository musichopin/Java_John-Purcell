package demo3;

// third method: when we want to run one method in its own thread
// and we do not wanna create separate class 

public class Application {
// we are using the Thread constructor with anonymous classes
    
    public static void main(String[] args) {
    	// as if we are passing an instance of the Runnable 
    	// class to the constructor
        Thread thread1 = new Thread(new Runnable() { 
        // anonymous class (Runnable) anonymous olarak pass edilmiþ
        // derived from: Thread thread1 = new Thread(new Runnable() {...});
        	
            @Override
            public void run() {
                for(int i=0; i<5; i++) {
                    System.out.println("Hello: " + i);
                    
                    try {
                        Thread.sleep(500); // 500 ms arayla output edilir
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                
            }
            
        });
        
        thread1.start();
        
                
        Thread thread2 = new Thread(new Runnable() { // yeni class yaratmak gibi

            @Override
            public void run() {
                for(int i=0; i<5; i++) {
                    System.out.println("Hello: " + i);
                    
                    try {
                        Thread.sleep(0); 
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
                
            }
            
        });
        
        thread2.start();

        System.out.println("Random");
        
                
    }

}
/*
Hello: 0
Random
Hellom: 0
Hellom: 1
Hellom: 2
Hellom: 3
Hellom: 4
Hello: 1
Hello: 2
Hello: 3
Hello: 4
*/