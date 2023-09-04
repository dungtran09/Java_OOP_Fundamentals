
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * BufferReader
 */
public class BufferReader {

    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter A string: ");
        String str = br.readLine();
        System.out.println(str);
    }
}
