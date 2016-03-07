import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Worker {
    
    private Random random = new Random(); // random number generator
    
    private Object lock1 = new Object(); 
    private Object lock2 = new Object();
    // it is better practice to declare separate lock object variables
    // rather than locking actual objects (List) that we want to write to  
    
    private List<Integer> list1 = new ArrayList<Integer>();
    private List<Integer> list2 = new ArrayList<Integer>();
    
    public void stageOne() { 
    	// public synchronized void stageOne() ve public synchronized void stageTwo() 
    	// denseydi iþlem 4 saniye sürecekti. zira sadece t1, Worker objectin kilidine sahip olacaktý.
    	// stageOne metodu lock1'e stageTwo metodu lock 2'ye sahip olarak iþlem 2 saniyeye indi.
    	// stageOne ve stageTwo metodlarýnýn birbirinden baðýmsýz olmasý önemli
    	// t1, stageOne metodu ile ilgilenirken t2, stageTwo metodu ile ilgilendi.
        
        synchronized (lock1) { // synchronized code blocks
            list1.add(random.nextInt(100)); // adding random numbers (0-99) to list1 
        }
        
        try {
            Thread.sleep(1); // having 1 ms of break. Sleep method doesn't need to be synced
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    
    }
    
    public void stageTwo() {
        
        synchronized (lock2) {
            list2.add(random.nextInt(100));
        }
        
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
    public void process() {     // calling stage one and stage two in a loop
        for(int i=0; i<1000; i++) {
            stageOne(); // thread içerisinde iþlemler sýrasý ile gerçekleþir
            stageTwo();
        }
    }

    public void main() {
        System.out.println("Starting ...");
        
        long start = System.currentTimeMillis();
        
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                process();
            }
        });
        
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                process();
            }
        });
        
        t1.start(); // run method is activated in t1
        t2.start();
        
        try {
            t1.join(); 
            t2.join(); // we are waiting for the threads to be finished
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        long end = System.currentTimeMillis();
        
        System.out.println("Time taken: " + (end - start)); // we are calculating the time how long this process takes
        System.out.println("List1: " + list1.size() + "; List2: " + list2.size());
    }
}