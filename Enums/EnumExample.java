public class EnumExample {
  public enum WeekDay {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
  }

  public static void main(String[] args) {

    for (WeekDay day : WeekDay.values()) {
      System.out.println("Day: " + day);
      
    }
  }
}
