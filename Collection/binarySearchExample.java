import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class binarySearchExample {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("one");
    list.add("two");
    list.add("four");
    list.add("three");
    list.add("five");
    
    
    System.out.println("BEFORE SWAP: ");
    Iterator<String> iterator = list.iterator();
    while (iterator.hasNext()) {
      String element = iterator.next();
      System.out.println(element);
    }
    
    System.out.println("\nAFTER SWAP: ");
    String temp = list.get(2);
    list.set(2, list.get(3));
    list.set(3, temp);

    list.forEach((e) -> System.out.println(e));
  
  }
}
