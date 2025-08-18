package multithreading.locks.condition;

public class Main {
    public  static void main(String[] args) {
        // Create a shared resource
        sharedResource sharedResource = new sharedResource();


        Thread t1 = new Thread(sharedResource::consume, "Consumer Thread 1");
        Thread t2 = new Thread(sharedResource::produce, "Producer Thread 2");

        t1.start();
        t2.start();
    }
}
