package Thread;

public class Deadlock {
    public static void main(String[] args) {
        final String resource1 = "R1";
        final String resource2 = "R2";
        Thread t1=new Thread(){
            public void run()
            {
                synchronized (resource1)
                {
                    System.out.println(Thread.currentThread().getName()+"-->"+resource1);
                }
                try { Thread.sleep(10000);} catch (Exception e) {}
                synchronized (resource2)
                {
                    System.out.println(Thread.currentThread().getName()+"-->"+resource2);

                }
            }

        };

        Thread t2=new Thread(){
            public void run()
            {
                synchronized (resource2)
                {
                    System.out.println(Thread.currentThread().getName()+"-->"+resource2);
                }
                try { Thread.sleep(10000);} catch (Exception e) {}
                synchronized (resource1)
                {
                    System.out.println(Thread.currentThread().getName()+"-->"+resource1);

                }
            }

        };

        t1.start();
        t2.start();
    }


}
