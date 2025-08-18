package multithreading.locks.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class sharedResource {

    private boolean isAvailable = false;
    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void produce() {
        try {
            lock.lock();
            if(isAvailable){
                System.out.println(Thread.currentThread().getName() + ": Resource already available, waiting to consume...");
                condition.await();
            }
            isAvailable = true;
            System.out.printf("%s: Acquired lock, producing resource...\n", Thread.currentThread().getName());
            Thread.sleep(4000);
            condition.signalAll();
        } catch (InterruptedException ignore) {
            // Handle interruption
        } finally {
            System.out.printf("%s: Finished producing resource, releasing lock...\n", Thread.currentThread().getName());
            lock.unlock();
        }
    }

    public void consume() {
        lock.lock();
        try{
            if (!isAvailable) {
                condition.await();
                System.out.printf("%s: No resource available to consume.\n", Thread.currentThread().getName());
            }
            System.out.printf("%s: Consuming resource...\n", Thread.currentThread().getName());
            isAvailable = false;
            condition.signalAll();
        } catch (InterruptedException ignore) {

        } finally {
            System.out.printf("%s: Finished consuming resource, releasing lock...\n", Thread.currentThread().getName());
            lock.unlock();
        }
    }

}

