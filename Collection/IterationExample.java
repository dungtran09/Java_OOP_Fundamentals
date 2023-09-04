import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationExample {
  public static void main(String[] args) {
    // modificationDuringIteration();
    // removeElementsDuringIteraion();
    forEachRemaining();
  }
  
  public static void modificationDuringIteration() {
    List<String> list = new ArrayList<>();
    
    list.add("123");
    list.add("456");
    list.add("789");
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      String value = iterator.next();
      if (value.equals("456")) {
        list.add("999");
      }
    }
  }

  public static void removeElementsDuringIteraion() {
    List<String> list = new ArrayList<>();
    
    list.add("123");
    list.add("456");
    list.add("789");
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      String value = iterator.next();
      if (value.equals("456")) {
        iterator.remove();
      }
    }
  }

  public static void forEachRemaining() {
    List<String> name = new ArrayList<>();
    name.add("Jane");
    name.add("heidi");
    name.add("Hannad");

    Iterator<String> iterator = name.iterator();

    iterator.forEachRemaining((element) -> {
      System.out.println(element);
    });
  }

} 
