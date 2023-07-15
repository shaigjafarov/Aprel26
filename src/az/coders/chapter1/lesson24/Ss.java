package az.coders.chapter1.lesson24;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Ss {
    public static void main(String[] args) {
        // ScheduledExecutorService'i oluştur
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        // İşleri zamanlama
        Runnable task = () -> System.out.println("Scheduled task is running!");
        int initialDelay = 0; // Başlangıç gecikmesi (saniye)
        int period = 5; // İşler arasındaki süre (saniye)

        executor.scheduleAtFixedRate(task, initialDelay, period, TimeUnit.SECONDS);

        // Programı bir süre çalıştır
        try {
            Thread.sleep(16000);
            executor.shutdownNow();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }}
