public class ThrowKeywordExcample {
  public static void main(String[] args) {
    validate(13);
    System.out.println("Rest of the code...");
  }

  public static void validate(int age) {
    if (age < 18) {
      throw new ArithmeticException("In valid!");
    } else {
      System.out.println("Wecome to vote!");
    }
  }
}
