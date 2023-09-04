import java.io.FileInputStream;

public class FileInputStreamExample {
  public static void main(String[] args) {
    try {
      FileInputStream fis = new FileInputStream("input.txt");
      System.out.println("The data in file is: ");

      int ch = fis.read();

      while (ch != -1) {
        System.out.print((char) ch);
        ch = fis.read();
      }

      fis.close();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
