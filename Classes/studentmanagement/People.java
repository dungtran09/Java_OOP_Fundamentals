public abstract class People {
  private int id;
  private String name;
  private int age;

  public People() {
    System.out.println("People init contructor.");
  }

  public abstract void running();
}
