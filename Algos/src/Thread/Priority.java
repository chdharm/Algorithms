package Thread;

public class Priority implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread running..."+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Priority priority=new Priority();
        Thread t1=new Thread(priority);
        Thread t2=new Thread(priority);

        t1.setPriority(10);
        t2.setPriority(2);

        t2.start();
        t1.start();

    }
}
