package Thread;

public class Thread_Akshay extends Thread {

    public static void main(String[] args) {
        Thread_Akshay thread_akshay=new Thread_Akshay();
        thread_akshay.start();

    }

    public void run()
    {
        System.out.println("Thread is runnung");
    }
}
