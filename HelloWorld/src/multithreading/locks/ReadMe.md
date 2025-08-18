# Java Multithreading: Locks and Conditions

This lecture delves into various types of locks in Java multithreading, emphasizing **locks** and **conditions**.

It starts with a recap of **synchronized blocks**, which utilize monitor locks to allow only one thread access to a critical section at a time. However, these blocks have limitations as they lock based on object instances.

---

## Custom Locks

To address these limitations, Java provides several advanced locking mechanisms:

### 1. Reentrant Lock
- Allows locking independent of the object.
- Multiple threads can use different objects while sharing the same lock.

### 2. Read-Write Lock
- Supports **shared (read)** and **exclusive (write)** locks.
- Enables multiple threads to read simultaneously while restricting write access to one thread.
- Improves performance in **read-heavy** scenarios.

### 3. Stamped Lock
- An advanced mechanism combining features of **read-write locks** and **optimistic locking**.
- Particularly useful in **high-read environments**.

### 4. Semaphore
- Allows a specified number of threads to access a critical section concurrently.
- Commonly used for **resource management**, such as **connection pools**.

---

## Inter-Thread Communication with Conditions
Instead of using the traditional `wait` and `notify` methods, **Condition objects** are used for communication between threads.

- `await()` → Similar to `wait()`, makes a thread wait.
- `signal()` → Similar to `notify()`, wakes up a waiting thread.

This provides more flexibility and better control over synchronization compared to intrinsic locks.

---

## Key Takeaway
Choosing the right lock depends on the **concurrency requirements** of the application. Each lock type offers trade-offs in terms of **performance, safety, and flexibility**.
