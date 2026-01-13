package Threads;

class MyThread extends Thread {

    // Constructor
    MyThread(String name) {
        super(name); // Call base class (Thread) constructor
        start(); // Start the thread
    }

    // run() method
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Child Thread (" + getName() + "): " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        // public static void main(String[] args) throws InterruptedException{

        // Create child thread
        MyThread t = new MyThread("MyThread");

        // Check thread status before join
        System.out.println("Is child thread alive? " + t.isAlive());

        try {
            // Main thread waits for child thread to finish
            t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        // t.join();

        // Main thread execution (after child thread finishes)
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        // Check thread status after completion
        System.out.println("Is child thread alive? " + t.isAlive());
    }
}
