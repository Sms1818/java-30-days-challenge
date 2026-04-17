
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
Problem

Create a program where:

Two threads share a counter
Thread-1 prints odd numbers from 1 to 10
Thread-2 prints even numbers from 1 to 10
Output must be strictly alternating
Expected Output
Thread-1 -> 1
Thread-2 -> 2
Thread-1 -> 3
Thread-2 -> 4
...
Thread-2 -> 10
📌 Rules
Use Lock and Condition
Do not use synchronized
Do not use wait() / notify()
Both threads must share the same object
*/

// Output will be strictly alternating between odd and even numbers from 1 to 10, printed by two different threads.
// Thread-1 -> 1
// Thread-2 -> 2
// Thread-1 -> 3
// Thread-2 -> 4
// Thread-1 -> 5
// Thread-2 -> 6
// Thread-1 -> 7
// Thread-2 -> 8
// Thread-1 -> 9
// Thread-2 -> 10
// Finished printing numbers up to 10

class NumberTask {
    private int count=1;
    private final int end;

    private final Lock lock=new ReentrantLock();
    private final Condition condition=lock.newCondition();
    public NumberTask(int end){
        this.end=end;
    }

    public void printOdd() throws InterruptedException{
        lock.lock();
        try {
            while(count<=end){
                while(count%2==0){
                    condition.await();
                }
                if (count <= end) {
                    System.out.println(Thread.currentThread().getName() + " -> " + count);
                    count++;
                    condition.signalAll();
                }
            }
            
        }
        finally {
            lock.unlock();
        }
    }
    public void printEven() throws InterruptedException {
        lock.lock();
        try {
            while (count <= end) {

                while (count % 2 != 0) {
                    condition.await();
                }

                if (count <= end) {
                    System.out.println(Thread.currentThread().getName() + " -> " + count);
                    count++;
                    condition.signalAll();
                }
            }
        } finally {
            lock.unlock();
        }
    }

}

public class MultiThreadProblem7 {
    public static void main(String[] args) throws InterruptedException {
        NumberTask task = new NumberTask(10);
        Thread t1 = new Thread(() -> {
            try {
                task.printOdd();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Thread-1");

        Thread t2 = new Thread(() -> {
            try {
                task.printEven();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, "Thread-2");

        t1.start();
        t2.start();
            
        t1.join();
        t2.join();

        System.out.println("Finished printing numbers up to 10");

    }
}
