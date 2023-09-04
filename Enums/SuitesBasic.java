public class SuitesBasic {
  public enum Suites {
    CLUBS,
    SPADES,
    HEARTS,
    DIAMONDS;  
  }
  
  public static void verifyEnumValues(Suites suite) {
    if (suite == Suites.CLUBS) {
      System.out.println("Suite is CLUBS");
    } else if (suite == Suites.DIAMONDS) {
      System.out.println("Suite is DIAMONDS");
    } else if (suite == Suites.HEARTS) {
      System.out.println("Suite is HEARTS");
    } else if (suite == Suites.SPADES) {
      System.out.println("Suite is SPADES");
    } else {
      System.out.println("Invalid suite!");
    }
  }

  public static void main(String[] args) {
    Suites suite = Suites.DIAMONDS;
    verifyEnumValues(suite);
  }
}
