
public class Worker {
    private int count = 0;
    
    public synchronized void increment() {
    	// only 1 thread can acquire the lock at a time for the Worker object
    	// 2nd thread would have to wait to use the count variable
        // synchronized kw yerine (thread1.start() tan sonra) thread1.join();
        // denseydi thread2, thread1'i tamamen bekleyecekti
        count++;
    }
    
    public static void main(String[] args) {
    	Worker work = new Worker();
    	work.run();
    }
    
    public void run() { // aþaðýdaki run metodundan farklý
        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 100000; i++) {
                    increment();
                }
            }
        });
        thread1.start(); // run method has been activated
        
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                for(int i = 0; i < 100000; i++) { // i (storing) = i (reading) + 1 (incrementing)
                    increment();
                }
            }
        });
        thread2.start();
        
        try {
            thread1.join(); 
            thread2.join();
            // we call join method
            // in order to pause the execution of main thread 
            // until thread1 and thread2 are finished 
            
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        System.out.println("Count is: " + count);
    }
}
/*
Count is: 200000
*/