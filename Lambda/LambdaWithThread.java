

public class LambdaWithThread {
  public static void main(String[] args) {
    
    Runnable r1 = new Runnable() {
      public void run() {
        System.out.println("Thread 1 is running....");
      }
    };
    Thread t1 = new Thread(r1);
    t1.start();

    Runnable r2 = () -> {
      System.out.println("Thread 2 is running...");
    };
    Thread t2 = new Thread(r2);
    t2.start();

    Runnable r3 = () -> {
      System.out.println("Thread 3 is running...");
    };
    Thread t3 = new Thread(r3);
    t3.start();

    Runnable r4 = () -> {
      System.out.println("Thread 4 is running...");
    };
    Thread t4 = new Thread(r4);
    t4.start();
  }
}
