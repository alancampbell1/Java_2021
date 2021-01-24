package Multithreading;

/**
 * 
 * @author alancampbell
 * 
 * Java is a multi-threaded programming language. This means you can develop multi-threaded programs. 
 * 
 * A multi-threaded program contains two or more parts that run concurrently, each handling a different task at the same
 * time. This makes optimal usage of a PC's available resources, especially if a PC has multiple CPUs.
 * 
 * The OS divides processing time among the different applications. 
 * 
 * The lifecycle of a thread is: Born -> Started -> Runs -> Dies.
 * 
 * In Java, threads are given a priority in relation to which task is most important. This is between a MIN_PRIORITY of 1
 * and a MAX_PRIORITY of 10. Default threads are given a priority of 5. 
 * 
 * If your class is intended to be run as an executable thread, you need to implement the Runnable interface. 
 *
 */

class RunnableDemo implements Runnable {
	
	private Thread t;				//This is the physical thread.
	private String threadName;
	
	/**
	 * This constructor is used to assign the Thread a name.
	 * 
	 */
	RunnableDemo(String name) {
		threadName = name;
		System.out.println("...Creating the thread: " + threadName);
	}
	
	/**	
	 * This method is defined in the Runnable interface and needs a body defined here to compile correctly.
	 **/
	public void run() {
		System.out.println("...Currently running the thread " + threadName);
		
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("Thread: " + threadName + ", " + i);
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("InterruptedException occurred on thread: " + threadName + " Issue: " + e);
		}
		
		System.out.println("...Thread " + threadName + " Exiting.");
	}
	
	public void start() {
		System.out.println("...Starting thread: " + threadName);
		
		if(t == null) {
			t = new Thread (this, threadName);
			t.start();
		}
	}	
}

public class basicMultithreading {

	public static void main(String [] args) {
		
		/**
		 * Process of events:
		 * - A RunnableDemo object is created called 't1'. This instantly calls on the constructor and prints the '...Creating'
		 * statement.
		 * - The start() method is called from 't1' which prints the "...Starting" statement.
		 * - These two events are repeated with t2.
		 * - If t is blank (which it is) a Thread object is created called 't'. By calling on start();, you are effectively
		 * calling on run(); 
		 * - When Thread.sleep() is hit from t1, the second object 't2' creates its own 't' object and calls on start();
		 * which calls on run();. 
		 * - This causes the thread to run through the same process. When it hits Thread.sleep() it pauses operations and
		 * t1 picks up again. This results in the mixed up returned statements printed out.
		 */
		
		RunnableDemo t1 = new RunnableDemo("thread-1");
		t1.start();
		
		RunnableDemo t2 = new RunnableDemo("thread-2");
		t2.start();
		
		
	}
}
