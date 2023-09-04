public class TryFinallyExample {
  public static void main(String[] args) {
    try {
      System.out.println("We are in Try.");
    } finally {
      System.out.println("We are in Finally.");
    }

    System.out.println("We are in after Finally.");
  }
}
