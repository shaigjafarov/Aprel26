package az.coders.chapter1.lesson23;

public class ThreadSExample {


    public static void main(String[] args) {

        System.out.println(  Thread.currentThread().getName());
        new MyThread().start();

        Runnable runnable= ()-> {
            System.out.println("Salam"+ Thread.currentThread().getName());
        return;};
        new Thread(runnable).start();

        System.out.println("main okey");
    }

}

      class MyThread extends Thread{
        @Override
        public void run(){
           Thread.currentThread().setName("user thread");

            try {

                Thread.currentThread().wait();

                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName());

        }
    }





