import java.io.File;

public class FileIOExample02 {
  public static void main(String[] args) {
    File file = new File("logfile.txt");

    if (file.exists()) {
      System.out.println("File exists in the folder.");
    } else {
      System.out.println("File is not exists in folder.");
    }
  }
}
