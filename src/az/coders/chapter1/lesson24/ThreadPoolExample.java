package az.coders.chapter1.lesson24;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Thread havuzunu oluştur
        ExecutorService executor = Executors.newCachedThreadPool();

        // İşleri yürüt
        for (int i = 0; i < 15; i++) {
            Runnable worker = new WorkerThread("Task-" + i);
            executor.execute(worker);
        }

        // Thread havuzunu kapat
        executor.shutdown();

        while (!executor.isTerminated()) {
            // Havuzun tamamen kapanmasını bekle
        }

        System.out.println("Tüm işler tamamlandı.");
    }
}

class WorkerThread implements Runnable {
    private String taskName;

    public WorkerThread(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(taskName + " başlıyor. THreadName "+ Thread.currentThread().getName());

        try {
            // Simüle edilen iş yürütme
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(taskName + " tamamlandı. THreadName "+ Thread.currentThread().getName());
    }
}
