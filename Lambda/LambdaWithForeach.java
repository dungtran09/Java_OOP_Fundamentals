import java.util.ArrayList;
import java.util.List;

public class LambdaWithForeach {
  public static void main(String[] args) {
    List<String> listNames = new ArrayList<>();
    listNames.add("Hoang");
    listNames.add("Quoc");
    listNames.add("Ty");
    listNames.add("Teo");
    listNames.add("Trung");

    listNames.forEach((name) -> {
      System.out.println(name);
    });
  }
}
