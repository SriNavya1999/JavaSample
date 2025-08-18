package multithreading.locks.readWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        SharedResource sharedResource2 = new SharedResource();

        ReadWriteLock lock = new ReentrantReadWriteLock();

        Thread t1 = new Thread(()-> sharedResource.produce(lock), "Producer - 1");
        Thread t2 = new Thread(()-> sharedResource.consumer(lock), "Consumer - 2");
        Thread t3 = new Thread(()-> sharedResource2.produce(lock), "Producer - 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
