package Threads;

public class SharedTask implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        // SharedTask task = new SharedTask();
        // task.run();
        // new Thread(task, "T1").start();
        // new Thread(task, "T2").start();

        Thread t = new Thread(new SharedTask());
        t.setName("T1");
        t.start();
        Thread t1 = new Thread(new SharedTask());
        t1.setName("T2");
        t1.start();
        /*
         * Thread t = new Thread(new SharedTask("t1"));
         * t.start();
         */
    }
}
