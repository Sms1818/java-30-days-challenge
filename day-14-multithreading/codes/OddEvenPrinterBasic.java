/*
Problem

Create two threads such that:

Thread-1 prints all odd numbers from 1 to 10
Thread-2 prints all even numbers from 1 to 10
📌 Rules
Use Runnable
Do not use synchronization yet
Do not use sleep() for coordination
Print thread name with the number
Example Output
Thread-1 -> 1
Thread-2 -> 2
Thread-1 -> 3
Thread-2 -> 4
...

The exact order may vary on each run. 
*/

// Output: It may vary on each run, but it will be a combination of the following lines in any order:
// Thread-2 -> 2
// Thread-2 -> 4
// Thread-2 -> 6
// Thread-2 -> 8
// Thread-2 -> 10
// Thread-1 -> 1
// Thread-1 -> 3
// Thread-1 -> 5
// Thread-1 -> 7
// Thread-1 -> 9

class OddEvenNumberTask implements Runnable{
    private int end;
    private boolean printOdd;
    public OddEvenNumberTask(int end, boolean printOdd){
        this.end=end;
        this.printOdd=printOdd;
    }

    @Override
    public void run(){
        int start=printOdd?1:2;
        for(int i=start;i<=end;i++){
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }
}

public class OddEvenPrinterBasic {
    public static void main(String[] args) {
        Thread t1=new Thread(new OddEvenNumberTask(10, true), "Thread-1");
        Thread t2=new Thread(new OddEvenNumberTask(10, false), "Thread-2");
        t1.start();
        t2.start();
    }
    
}
