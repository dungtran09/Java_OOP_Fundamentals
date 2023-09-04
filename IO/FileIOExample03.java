import java.io.File;

public class FileIOExample03 {
  public static void main(String[] args) {
    File file = new File("filetext.txt");
    if (file.exists()) {
      System.out.println("File exists in the folder!");
    } else {
      System.out.println("File is not exists in the folder!");
    }
  }
}
