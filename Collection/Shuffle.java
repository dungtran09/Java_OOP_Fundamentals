import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shuffle {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("one");
    list.add("two");
    list.add("three");

    Collections.shuffle(list);

    list.forEach((element) -> {
      System.out.println(element);
    });
  }
}
