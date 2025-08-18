package multithreading.locks.seemaphoreLock;

public class Main {
    public static void main(String[] args) {
        // Create a shared resource
        sharedResource sharedResource = new sharedResource();

        Thread t1 = new Thread(sharedResource::produce,"Producer Thread 1");
        Thread t2 = new Thread(sharedResource::produce,"Producer Thread 2");
        Thread t3 = new Thread(sharedResource::produce,"Producer Thread 3");
        Thread t4 = new Thread(sharedResource::produce,"Producer Thread 4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
