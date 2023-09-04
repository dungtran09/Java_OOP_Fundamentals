import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("one");
    list.add("two");
    list.add("three");
  
    // solution1
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      String element = iterator.next();
      System.out.println(element);
    }
    
    //solution2
    list.forEach((element) -> {
      System.out.println(element);
    });

  }
}
