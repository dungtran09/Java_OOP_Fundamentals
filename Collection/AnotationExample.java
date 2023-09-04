class Supper {
  public void printMessage() {
    System.out.println("This is supper class.");
  }
}

class Sub extends Supper {
  @Override
  public void printMessage() {
    System.out.println("This is sub class.");
  }
}
  
public class AnotationExample {
  public static void main(String[] args) {
    Supper sp = new Sub();
    sp.printMessage();
  } 
}
