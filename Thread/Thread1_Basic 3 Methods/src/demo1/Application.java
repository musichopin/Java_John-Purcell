package demo1;

//thread is like a separate operating system process 
//which can run concurrently with other threads
// It is used when you need to do two things at the same time. 
// Small programs often don't need threading. 

class Runner extends Thread { 
	// we are extending the Thread class as the first method

    @Override 
    public void run() { // overriding the run method from Thread class
        for(int i=0; i<5; i++) {
            System.out.println("Hello: " + i);
            
            try {
                Thread.sleep(100); // pause for 100 ms in each thread
                // we are calling sleep method from Thread class
                // Thread class extend edilmeden de sleep metodu çaðýrýlabilir
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}


public class Application {
    
    public static void main(String[] args) {
    	// to run the above code in its own thread
    	// we need to create instance of above class
        Runner runner1 = new Runner();
        runner1.start();
        // we are calling the start method of the Thread class
        
        // if we called the run method it would run in the main thread of the application.
        // by calling the start method we tell the thread class to go and look for the run 
        // method and run that in its own special thread
        
        Runner runner2 = new Runner();
        runner2.start();

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