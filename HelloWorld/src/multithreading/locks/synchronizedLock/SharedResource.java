package multithreading.locks.synchronizedLock;

public class SharedResource {

    boolean isAvailable = false;

    public synchronized void produce() {
        try{
            System.out.println("Lock acquired by :" + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (InterruptedException ignored) {

        }
        System.out.println("Lock released by:" + Thread.currentThread().getName());
    }
}
