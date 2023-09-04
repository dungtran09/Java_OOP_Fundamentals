
import java.io.Console;

public class ConsoleDemo {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.print("Enter Username: ");
        String use = console.readLine();
        
        System.out.print("Enter PassWord: ");
        char[] passw = console.readPassword();
        
        System.out.println(use);
        System.out.println(passw);
        
    }
}
