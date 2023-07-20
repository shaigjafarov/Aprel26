package az.coders.chapter1.lesson25;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.*;

public class ConcurrentCallableExample {

    public static void main(String[] args) {
        int numberOfTasks = 5;
        ExecutorService executorService = Executors.newFixedThreadPool(numberOfTasks);

        List<Future<String>> futures = new ArrayList<>();

        // Submit tasks to the executor and store the Future objects
        for (int i = 0; i < numberOfTasks; i++) {
//            Callable<String> callable = new MyCallable(i + 1);


            Future<String> future = executorService.submit(()-> UUID.randomUUID().toString());
            futures.add(future);
        }

        // Retrieve results from the Future objects
        for (int i = 0; i < numberOfTasks; i++) {
            try {
                String result = futures.get(i).get();
                System.out.println("Task " + (i + 1) + " Result: " + result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        // Shutdown the executor
        executorService.shutdown();
    }
}

class MyCallable implements Callable<String> {
    private final int taskId;

    public MyCallable(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public String call() throws Exception {
        // Simulate some computation
        Thread.sleep(1000);
        return "Result of Task " + taskId;
    }
}
