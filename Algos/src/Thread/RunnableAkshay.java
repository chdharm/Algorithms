package Thread;

public class RunnableAkshay implements Runnable {
    @Override
    public void run() {
        for(int i=1;i<5;i++){
            try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        RunnableAkshay runnableAkshay=new RunnableAkshay();
        Thread t1=new Thread(runnableAkshay);
        Thread t2=new Thread(runnableAkshay);
        t1.start();
        t2.start();

    }
}
