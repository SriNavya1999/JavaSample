package multithreading.locks.stampedLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        SharedResource sharedResource = new SharedResource();

        // Uncomment below lines of code instead of OptimisticProduce to see the difference
        // between optimistic read lock and read lock.
        // If you use read lock, the producer threads will block consumer until both of them
        // finishes its work. If you use optimistic read lock, the producer threads will not block the consumer thread.

//        Thread t1 = new Thread(sharedResource::Produce, "Producer Thread 1");
//        Thread t2 = new Thread(sharedResource::Produce, "Producer Thread 2");

        Thread t1 = new Thread(sharedResource::OptimisticProduce, "Producer Thread 1");
        Thread t2 = new Thread(sharedResource::OptimisticProduce, "Producer Thread 2");

        Thread t3 = new Thread(sharedResource::Consume, "Consume Thread 3");

        t1.start();
        t2.start();
        Thread.sleep(1000);
        t3.start();
    }
}
