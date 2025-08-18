package multithreading.locks.stampedLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {

    int a = 10;

    StampedLock stampedLock = new StampedLock();

    public void Produce(){
        long stamp = stampedLock.readLock();
        try{
            System.out.println("Read lock acquired by: " + Thread.currentThread().getName());
            a++;
            Thread.sleep(6000);
            System.out.println("Updated the value successfully: " + a + " by " + Thread.currentThread().getName());
        } catch (Exception ignore) {
        }
        finally{
            stampedLock.unlockRead(stamp);
            System.out.println("Read lock released by: " + Thread.currentThread().getName());
        }
    }

    public void OptimisticProduce(){
        long stamp = stampedLock.tryOptimisticRead();
        try{
            System.out.println("Optimistic Read lock acquired by: " + Thread.currentThread().getName());
            a++;
            Thread.sleep(2000);
            if(!stampedLock.validate(stamp)) {
                a = 10;
                System.out.println("Rollback: " + a + " by " + Thread.currentThread().getName());
            } else
                System.out.println("Updated the value successfully: " + a + " by " + Thread.currentThread().getName());
        } catch (Exception ignore) {
        }
    }

    public void Consume(){
        long stamp = stampedLock.writeLock();
        try {
            System.out.println("Write lock acquired by: " + Thread.currentThread().getName());
            Thread.sleep(4000);
        } catch (InterruptedException ignore) {
        }
        finally {
            stampedLock.unlockWrite(stamp);
            System.out.println("Write lock released by: " + Thread.currentThread().getName());
        }
    }
}
