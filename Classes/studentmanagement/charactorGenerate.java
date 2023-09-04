import java.util.ArrayList;
import java.util.List;

public class charactorGenerate {
  public static void main(String[] args) {
    List<Character> cList = new ArrayList<>();
    
    if (cList.isEmpty()) {
      System.out.println("charactor list is empty!");
    } else {
      System.out.println("charactor list is not empty!");
    }

    for (int i = (int)'a'; i <= (int)'z'; i++) {
      cList.add((char)i);
    }
    
    for (int i = (int)'A'; i <= (int)'Z'; i++) {
      cList.add((char)i);
    }
    
    for (int i = (int)'0'; i <= (int)'9'; i++) {
      cList.add((char)i);
    }

    for (Character ch : cList) {
      System.out.print(ch);
    }
    System.out.println('\n');
    
  }
}
