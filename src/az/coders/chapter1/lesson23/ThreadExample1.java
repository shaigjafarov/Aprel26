package az.coders.chapter1.lesson23;

public class ThreadExample1 {
    public static void main(String[] args) {
        Message message = new Message();

        Thread producerThread = new Thread(new Producer(message));
        Thread consumerThread = new Thread(new Consumer(message));

        producerThread.start();
        consumerThread.start();
    }
}

class Message {
    private String message;
    private boolean empty = true;

    public synchronized String read() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        empty = true;
        notifyAll();
        return message;
    }

    public synchronized void write(String message) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        empty = false;
        this.message = message;
        notifyAll();
    }
}

class Producer implements Runnable {
    private Message message;

    public Producer(Message message) {
        this.message = message;
    }

    public void run() {
        String[] messages = {"Message 1", "Message 2", "Message 3"};

        for (String msg : messages) {
            message.write(msg);
            System.out.println("Produced: " + msg);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        message.write("Finished");
    }
}

class Consumer implements Runnable {
    private Message message;

    public Consumer(Message message) {
        this.message = message;
    }

    public void run() {
        while (true) {
            String msg = message.read();
            System.out.println("Consumed: " + msg);

            if (msg.equals("Finished")) {
                break;
            }
        }
    }
}
