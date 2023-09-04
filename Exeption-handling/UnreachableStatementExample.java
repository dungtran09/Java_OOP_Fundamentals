public class UnreachableStatementExample {
  public static void main(String[] args) {
    System.out.println(m1());
  }

  public static int m1() {
    try {
      System.out.println("In Try.");
      return 10;
    } catch (ArithmeticException ae) {
      System.out.println("In Catch.");
      return 20;
    } finally {
      System.out.println("In Finally.");
      return 30;
    }
    System.out.println("In after Finally block.");
  }
}
