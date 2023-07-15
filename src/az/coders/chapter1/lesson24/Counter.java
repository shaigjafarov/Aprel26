package az.coders.chapter1.lesson24;

public class Counter {
    private int count;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

 class Example {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // İş parçacıkları oluşturuluyor
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // İş parçacıkları başlatılıyor
        thread1.start();
        thread2.start();

        // İş parçacıklarının tamamlanması bekleniyor
//        thread1.join();
//        thread2.join();

        // Counter değeri yazdırılıyor
        System.out.println("Counter değeri: " + counter.getCount());
    }
}
