package multithreading.locks.seemaphoreLock;

import java.util.concurrent.Semaphore;

public class sharedResource {

    boolean isAvailable = false;

    Semaphore semaphore = new Semaphore(2);

    public void  produce() {

        try {
            semaphore.acquire();
            isAvailable = true;
            System.out.printf("%s: Acquired semaphore, producing resource...\n", Thread.currentThread().getName());
            Thread.sleep(4000);
        } catch (InterruptedException ignore) {

        }
        finally {
            System.out.printf("%s: Finished producing resource, releasing semaphore...\n", Thread.currentThread().getName());
            semaphore.release();
        }
    }
}
