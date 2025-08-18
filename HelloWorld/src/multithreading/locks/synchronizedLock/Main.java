package multithreading.locks.synchronizedLock;

public class Main {
    public static void main(String[] args){

        SharedResource sharedResource = new SharedResource();

        Thread t1 = new Thread(sharedResource::produce, "Thread-1");
        Thread t2 = new Thread(sharedResource::produce, "Thread-2");

        t1.start();
        t2.start();

        SharedResource sharedResource2 = new SharedResource();
        Thread t3 = new Thread(sharedResource2::produce, "Thread-3");

        t3.start();
    }
}
