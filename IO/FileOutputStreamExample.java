import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
  public static void main(String[] args) throws IOException {
    
    FileOutputStream fos = new FileOutputStream("output.txt", true);
    DataInputStream dis = new DataInputStream(System.in);
    char ch;

    System.out.println("Enter chars and press '#' to save.");
    ch = (char) dis.read();
    while (ch != '#') {
      fos.write(ch);
      ch = (char) dis.read();

      fos.close();
      dis.close();
    }
  }
}
