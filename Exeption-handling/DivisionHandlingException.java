import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisionHandlingException {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int a, b, c;

    try {
      System.out.print("Enter first number: ");
      a = Integer.parseInt(br.readLine());
      
      System.out.print("Enter second number: ");
      b = Integer.parseInt(br.readLine());
      
      c = a / b;
      
      System.out.println("Result: " + c);
    } catch (ArithmeticException exception) {
      System.out.println("Please dont pass second value as zero!");
    }
  }
}
