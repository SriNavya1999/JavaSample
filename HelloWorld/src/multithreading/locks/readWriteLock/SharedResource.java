package multithreading.locks.readWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {

    boolean isAvailable = false;

    public synchronized void produce(ReadWriteLock lock) {
        try{
            lock.readLock().lock();
            System.out.println("Read Lock acquired by :" + Thread.currentThread().getName());
            // We are not supposed to change the state of the resource in read lock
            Thread.sleep(4000);
        } catch (InterruptedException ignored) {

        }
        finally {
            lock.readLock().unlock();
            System.out.println("Read Lock released by:" + Thread.currentThread().getName());
        }
    }

    public synchronized void consumer(ReadWriteLock lock) {
        try{
            lock.writeLock().lock();
            System.out.println("Write Lock acquired by :" + Thread.currentThread().getName());
            isAvailable = false;
            Thread.sleep(4000);
        } catch (InterruptedException ignored) {

        }
        finally {
            lock.writeLock().unlock();
            System.out.println("Write Lock released by:" + Thread.currentThread().getName());
        }
    }
}
