package multithreading.locks.reentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    boolean isAvailable = false;

    public void produce(ReentrantLock lock) {
        try {
            lock.lock();    // Acquire the lock
            System.out.println("Lock acquired by :" + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (InterruptedException ignored) {

        }
        finally {
            lock.unlock();   // Release the lock
            // Ensure that the lock is released even if an exception occurs
            // or if the thread is interrupted.
            // This is important to prevent deadlocks.
        }
        System.out.println("Lock released by:" + Thread.currentThread().getName());

    }
}
