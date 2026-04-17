/* 
Problem

Create two threads such that:

Thread 1 prints numbers from 1 to 5
Thread 2 prints numbers from 6 to 10
📌 Rules
Use Runnable (do NOT extend Thread)

Print output like:

Thread-1 -> 1
Thread-2 -> 6
*/

// Output: It may vary on each run, but it will be a combination of the following lines in any order:

// Thread-2 -> 6
// Thread-2 -> 7
// Thread-2 -> 8
// Thread-1 -> 1
// Thread-1 -> 2
// Thread-1 -> 3
// Thread-1 -> 4
// Thread-1 -> 5
// Thread-2 -> 9
// Thread-2 -> 10
class NumberTask implements Runnable{
   private int start;
   private int end;

   public NumberTask(int start, int end){
    this.start=start;
    this.end=end;
   }

   @Override
   public void run(){
    for(int i=start;i<=end;i++){
        System.out.println(Thread.currentThread().getName() + " -> " + i);
    }
   }
}

public class ThreadRangePrinter{
    public static void main(String[] args) {
        Thread t1=new Thread(new NumberTask(1,5), "Thread-1");
        Thread t2=new Thread(new NumberTask(6,10), "Thread-2");
        t1.start();
        t2.start();
    }
}