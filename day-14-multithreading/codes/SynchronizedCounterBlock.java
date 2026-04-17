/*
Problem

Create a program where:

Two threads share a counter object
Each thread increments the counter 5 times

Print:

Thread-1 incremented count to X
Thread-2 incremented count to Y

After both threads finish, print:

Final Count: 10
📌 Rules
Use Runnable
Ensure the counter updates are thread-safe
Use join() so the final count is printed after both threads complete
*/

// Output:
// Thread-1 incremented count to 1
// Thread-1 incremented count to 2
// Thread-2 incremented count to 3
// Thread-2 incremented count to 4
// Thread-2 incremented count to 5
// Thread-2 incremented count to 6
// Thread-1 incremented count to 7
// Thread-1 incremented count to 8
// Thread-1 incremented count to 9
// Thread-2 incremented count to 10
// Final Count: 10

class Counter implements Runnable{
    int count=0;
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            synchronized (this) {
                count++;
                System.out.println(Thread.currentThread().getName() + " incremented count to " + count);
            }
        }
    }
}
public class MultiThreadProblem4 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(counter, "Thread-1");
        Thread t2 = new Thread(counter, "Thread-2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Count: " + counter.count);
    }
}
