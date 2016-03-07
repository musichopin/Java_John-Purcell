import java.util.Scanner;
// when more than one thread shares the same data 
// data might be cached
// volatile kw prevents a thread caching variables 
// when variables not changed from within that thread
class Processor extends Thread {
	//both threads access same variable
	//main thread writes, other thread reads
	//to avoid cache of the variable by the second thread
	//volatile kw has been added so that second thread
	// in Threads class would certainly not ignore changes 
	// made by main thread
    private volatile boolean running = true;
    
    public void run() {
    	// We are running this code in a different thread to
    	// the main thread
        
        while(running) { 
            System.out.println("Running");
            
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
    public void shutdown() {
        running = false;
    }
}

public class App {

    public static void main(String[] args) {
        Processor pro = new Processor();
        
        // we are telling the Tread class to run the code 
        // in the run method in its own thread
        pro.start();
        // there are two threads in total:
       // one is thread in main program (main thread), 
       // second thread is executed when start method is called 
  
       System.out.println("Press Enter to Stop");
        
        // Create scanner object for the user input
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        //alt: new Scanner(System.in).nextLine();
        
        // when we hit the enter key we call this method:
        pro.shutdown();
    }

}
/*
Press Enter to Stop
Running
Running
Running
Running
Running
Running
Running
Running
Running
Running
Running
Running
Running
Running
Running
Running
Running
Running
Running
Running
Running
Running

*/