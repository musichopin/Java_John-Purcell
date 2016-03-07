import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


class Processor implements Runnable {
    
    private int id;
    
    public Processor(int id) {
        this.id = id;
    }
    
    public void run() {
        System.out.println("Starting: " + id);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        
        System.out.println("Completed: " + id);
    }
}

// thread pools are rapid way of managing lots of treads same time
// thread pool is like having no of workers (threads) in a factory and making each of them
// start and finish a task one at a time subsequently

public class Application {

    public static void main(String[] args) {
        
    	// we are calling a static method of Executors class named
    	// " newFixedThreadPool to create 2 threads "
        ExecutorService executor = Executors.newFixedThreadPool(2);
        // ExecutorService is an interface that defines certain﻿ methods for handling thread pools
        // we want to submit tasks to executor managerial thread
        
        for(int i=0; i<5; i++) { // we are giving 5 tasks for each thread
            executor.submit(new Processor(i));
            // we are submitting a task named new Processor
            // and we are giving the new Processor an id
        }
        
        System.out.println("All tasks submitted.");
        
        executor.shutdown();
        // we are stopping accepting new tasks and shutting the thread down
        // when all tasks of all threads are finished 
        // (it will wait for all the threads to be shutdown)

        try {
        	// executor.awaitTermination(timeout, unit);
        	// timeout: time we want to wait for
            executor.awaitTermination(1, TimeUnit.DAYS);
            // if threads don't do their tasks in 1 days 
            // it will return and we will do more stuff down this code
        } catch (InterruptedException e) {
        }
        
        System.out.println("All tasks completed.");
    }
    
}    

/*
All tasks submitted.
Starting: 1
Starting: 0
Completed: 0
Completed: 1
Starting: 2
Starting: 3
Completed: 3
Completed: 2
Starting: 4
Completed: 4
All tasks completed.

// threadpool diğer metodlardan (extending thread, runnable interface, anonymous class) farklı olarak  
// sadece output süresini kısalttı ve fazladan print etmedi
 */
 