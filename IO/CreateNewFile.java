import java.io.File;
import java.io.IOException;

public class CreateNewFile {
  public static void main(String[] args) throws IOException {
  
    // File logfile = new File("logfile.txt");
    // logfile.createNewFile();
    
    // File ioDir = new File("com/dungtran");
    // ioDir.mkdirs();
    
    File destination = new File("logfile.txt");

    System.out.println("Absolute Path: " + destination.getAbsoluteFile());
    System.out.println("File name: " + destination.getName());
    System.out.println("Parent name: " + destination.getParent());
    System.out.println("File Exists? " + destination.exists());
    System.out.println("Last modified: " + destination.lastModified());

  }
}
