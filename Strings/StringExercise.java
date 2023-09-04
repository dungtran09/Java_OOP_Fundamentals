import java.util.Scanner;

public class StringExercise {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String inputStr, searchStr;
    System.out.print("Enter a String for search: ");
    inputStr = scanner.nextLine();
    System.out.print("Enter String for search: ");
    searchStr = scanner.nextLine();
    
    // solution 1
    int count = 0;
    for (int i = -1; (i = inputStr.indexOf(searchStr, i + 1)) != -1; i++) {
      System.out.println("Index at: " + i);
      count++;
    }
    System.out.println("Number of string has found is: " + count);
    
    // solution 2 
    count = 0;
    int index;
    for (int i = 0; i < inputStr.length();) {
      index = inputStr.indexOf(searchStr, i);
      if (index >= 0) {
        System.out.println("Index at: " + index);
        count++;
        i = index + 1;
      } else {
        break;
      }
    }
    System.out.println("Number of string has found is: " + count);
    scanner.close();
  } 
}
