import java.util.Scanner;
import java.util.regex.Pattern;

public class RegularExpression {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{6}$");
    
    String str;
    System.out.print("Enter a string (a-z,A-Z,0-9): ");

    str = scanner.nextLine();

    if(pattern.matcher(str).find()) {
      System.out.println("Your entered is: " + str);
    } else {
      System.err.println("The string is not valid!");
    }
    scanner.close();
  }
}
