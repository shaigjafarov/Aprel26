//package az.coders.chapter1.lesson26;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//import java.util.UUID;
//import java.util.concurrent.*;
//
//public class Singleton {
//    @Override
//    public String toString() {
//        return "Singleton{" +
//                "st='" + st + '\'' +
//                '}';
//    }
//
//    String st;
//
//    // Private static instance variable
//    private static Singleton instance;
//
//    // Private constructor to prevent instantiation from outside the class
//    private Singleton(String st) {
//        this.st=st;
//        // Optional: Add any initialization code here
//    }
//
//    // Public static method to get the instance
//    public static Singleton getInstance(String st) throws InterruptedException {
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                if (instance == null) {
//                    instance = new Singleton(st);
//                }
//            }
//        }
//        return instance;
//    }
//
//    // Optional: Add other methods and instance variables as needed
//}
//class Main{
//
//
//    public static void main(String[] args) throws CloneNotSupportedException {
//
//        ExecutorService executorService = Executors.newFixedThreadPool(5);
//
//        List<Future<Singleton>> futures = new ArrayList<>();
//
//
//        for (int i = 0; i < 5; i++) {
//            Callable<Singleton> callable=()->Singleton.getInstance(UUID.randomUUID().toString());
//            Future<Singleton> future = executorService.submit(callable);
//            futures.add(future);
//        }
//
//        for (int i = 0; i < 5; i++) {
//            try {
//                Singleton result = futures.get(i).get();
//                System.out.println("Task " + (i + 1) + " Result: " + result);
//            } catch (InterruptedException | ExecutionException e) {
//                e.printStackTrace();
//            }
//        }
//
//

//
//
//
//    }
//
//
//}
