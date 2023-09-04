import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisionHandlingException04 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int a, b, c;

    try {
      System.out.println("Enter two number");
      System.out.print("Enter first number: ");
      a = Integer.parseInt(br.readLine());

      System.out.print("Enter second number: ");
      b = Integer.parseInt(br.readLine());

      c = a / b;

      System.out.println("Result: " + c);
    } catch (NumberFormatException numberFormatException) {
        System.out.println("Please pass only Integer number.");
    } catch (ArithmeticException arithmeticException) {
        System.out.println("Please don't not pass the second value is zero.");
    } catch (Exception exception) {
      System.out.println("Genaric exception.");
    }
  }
}
