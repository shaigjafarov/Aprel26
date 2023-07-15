package az.coders.chapter1.lesson24;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
    private AtomicInteger count=new AtomicInteger(0);



    public  void increment() {
        int sd=4;
        synchronized (this){
            count.incrementAndGet();
        }
    }
    public synchronized void decrement() {
        count.decrementAndGet();
    }

    public synchronized int getCount() {
        return count.get();
    }
}

 class Example5 {
    public static void main(String[] args) throws InterruptedException {
        AtomicCounter counter = new AtomicCounter();

        // İş parçacıkları oluşturuluyor
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.decrement();
            }
        });

        // İş parçacıkları başlatılıyor
        thread1.start();
        thread2.start();

        // İş parçacıklarının tamamlanması bekleniyor
        thread1.join();
        thread2.join();

        // Counter değeri yazdırılıyor
        System.out.println("Counter değeri: " + counter.getCount());
    }
}
