import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisionHandlingException02 {
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
    } catch (NumberFormatException numberFormatException) {
      System.out.println("Please pass only integer values!");
    } catch (ArithmeticException arithmeticException){
      System.out.println("Please don't pass the second value as zero!");
    }
  }
}
