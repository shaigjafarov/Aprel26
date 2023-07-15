package az.coders.chapter1.lesson24;

public class  Counter2 {
    private int count;

    public  synchronized void incdec(boolean b) {
        if(b)
        count++;
        else
            count--;
    }



    public  int getCount(){
        return count;
    }
}

 class Example2 {
    public static void main(String[] args) throws InterruptedException {
        Counter2 counter = new Counter2();





        // İş parçacıkları oluşturuluyor
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.incdec(true);
              new Object();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.incdec(false);
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