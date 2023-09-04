import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class DivisionException {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a, b, c;
    System.out.println("Enter any two number two division.");
    
    System.out.print("Enter first number: ");
    a = Integer.parseInt(br.readLine());

    System.out.print("Enter second number: ");
    b = Integer.parseInt(br.readLine());

    if (b == 0) {
      System.out.println("Second number shoud not be zero!");
    } else {
      c = a/b;
      System.out.println("Result: " + c);
    }

  }
}
