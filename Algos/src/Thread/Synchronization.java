package Thread;

public class Synchronization {
    public void print(int n) {
        synchronized (this) {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + "--->" + i * n);
            }
        }
    }
}

class MyThread implements Runnable
{
    Synchronization synchronization=new Synchronization();

    @Override
    public void run() {
    synchronization.print(100);
    }

    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        Thread t1=new Thread(myThread);
        Thread t2=new Thread(myThread);

        t1.start();
        t2.start();
    }
}
