import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("one");
    list.add("two");
    list.add("three");
    list.add("four");
    
    Collections.sort(list);

    for (String e : list) {
      System.out.println(e);
    }
  }
}
