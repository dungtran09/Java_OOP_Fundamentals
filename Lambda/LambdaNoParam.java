@FunctionalInterface
interface Sayable {
  public String say();
}

public class LambdaNoParam {
  public static void main(String[] args) {

    Sayable s = () -> {
      return "I hava nothing to say.";   
    };
    
    System.out.println(s.say());
  }
}
