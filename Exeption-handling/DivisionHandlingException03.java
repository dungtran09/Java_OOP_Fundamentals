import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisionHandlingException03 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a, b, c;

    try {
      System.out.println("ENTER TWO NUMBER TO DIVISION");
      
      System.out.print("Enter first number: ");
      a = Integer.parseInt(br.readLine());
      
      System.out.print("Enter second number: ");
      b = Integer.parseInt(br.readLine());

      c = a / b;

      System.out.println("Result of the division is: " + c);
    } catch (Exception ex) {
      System.out.println(ex.getMessage()); 
    }  
  }
}
