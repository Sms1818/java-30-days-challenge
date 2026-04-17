/*
Problem

Create a program where:

Two threads share the same counter object
Each thread increments the counter 5 times
After both threads finish, print the final counter value
📌 Rules
Use Runnable
Both threads must work on the same shared object
For now, do not use synchronization
Print thread name and updated counter value during increment
Example Output
Thread-1 incremented count to 1
Thread-2 incremented count to 2
Thread-1 incremented count to 3
...
Final Count: 10
*/

//Output: It may vary on each run, but it will be a combination of the following lines in any order:
// Thread-1 incremented count to 1
// Thread-2 incremented count to 2
// Thread-2 incremented count to 4
// Thread-2 incremented count to 5
// Thread-2 incremented count to 6
// Thread-2 incremented count to 7
// Thread-1 incremented count to 3
// Thread-1 incremented count to 8
// Thread-1 incremented count to 9
// Thread-1 incremented count to 10
// Final Count: 10

// Note: Due to the lack of synchronization, race conditions may occur, leading to inconsistent final count values across different runs.

class Counter implements Runnable{
    int count=0;

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            count++;
            System.out.println(Thread.currentThread().getName() + " incremented count to " + count);
        }
    }
}
public class MultiThreadProblem3 {
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
