public class Student extends People {
  private String rollNo;
  private String email;

  public Student() {
    super();
    System.out.println("Student init contructor.");
  }

  public void learning() {
    System.out.println("Student is learning!");
  }

  @Override
  public void running() {
    System.out.println("Student is running!");
  }
}
