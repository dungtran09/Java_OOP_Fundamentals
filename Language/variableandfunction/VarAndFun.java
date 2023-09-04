package variableandfunction;

import java.util.Scanner;

public class VarAndFun {
  public static void main(String[] args) {
    int number = getInteger();

    System.out.println("Your entered: " + number);
  }

  public static int getInteger() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an integer: ");
    int number = scanner.nextInt();
    
    scanner.close();
        
    return number;
  }

}
