interface Sayable {
  public String say (String message);
}

public class LambdaWithMulStatement {
  public static void main(String[] args) {
    
  
    Sayable person = (message) -> {
      String str1 = "I would like to say. ";
      String str2 = str1 + message;

      return str2;
    };
    System.out.println(person.say("Time is precious."));
  }
}
