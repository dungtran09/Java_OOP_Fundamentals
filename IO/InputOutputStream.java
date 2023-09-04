import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class InputOutputStream {
public static void main(String[] args) {
try {
  
byte bWrite[] = {11, 21, 34, 54, 67};

OutputStream os = new FileOutputStream("test.txt");

for (int i = 0; i < bWrite.length; i++) {
os.write(bWrite[i]);
}

os.close();

InputStream is = new FileInputStream("test.txt");
int size = is.available();
for (int i = 0; i < size; i++) {
System.out.print((char)is.read() + " ");
}

is.close();

} catch (Exception e) {
System.out.println("Exception.");
}
}
}
