package multithreading.locks.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {

        SharedResource sharedResource1 = new SharedResource();
        SharedResource sharedResource2 = new SharedResource();

        ReentrantLock lock = new ReentrantLock();

        Thread t1 = new Thread(() -> sharedResource1.produce(lock), "Thread-1");
        Thread t3 = new Thread(() -> sharedResource2.produce(lock), "Thread-3");

        t1.start();
        t3.start();
    }
}
