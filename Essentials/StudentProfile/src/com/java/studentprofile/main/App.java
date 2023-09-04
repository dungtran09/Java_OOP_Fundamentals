import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    inputProfile(); 
  }

  public static void inputProfile() {
    String name, address;
    int yob;
    Scanner sc = new Scanner(System.in);

    
    System.out.print("Enter your name: ");
    name = sc.nextLine().toUpperCase();
     
    System.out.print("Enter your of birth: ");
    String temp = sc.nextLine();
    yob = Integer.parseInt(temp);
    // yob = sc.nextInt();
    // sc.nextLine();    
    System.out.print("Enter your address: ");
    address = sc.nextLine().toUpperCase();

    System.out.println("\nYOUR PROFILE: ");

    System.out.println("\tName: " + name);
    System.out.println("\tYour Of Birth: " + yob);
    System.out.println("\tYour address: " + address);
    sc.close();
  }
}
