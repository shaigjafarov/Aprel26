package az.coders.chapter1.lesson24;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example4 {
    public static void main(String[] args) {
        // ExecutorService ile bir iş parçacığı havuzu oluşturuluyor
        ExecutorService executorService = Executors.newCachedThreadPool();

        // İş parçacıkları görev havuzuna gönderiliyor
        for (int i = 0; i < 10; i++) {
            Runnable task = new Task(i);
            executorService.execute(task);
        }

        // İş parçacığı havuzunun kapanması için bekleniyor
        executorService.shutdown();
    }
}

class Task implements Runnable {
    private int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task ID: " + taskId + " çalışıyor - Thread ID: " + Thread.currentThread().getId());
        // İş parçacığı tarafından gerçekleştirilecek görev buraya yazılır
    }
}
