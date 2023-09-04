
public class TryCatchFinalyExample02 {
  public static void main(String[] args) {
    try {
      System.out.println("In Try.");
      System.out.println(10 / 0);
    } catch (ArithmeticException ae) {
      System.out.println("In Catch.");
    } finally {
      System.out.println("In Finally.");
    }

    System.out.println("After Try Catch anf Finally.");
  }
} 
