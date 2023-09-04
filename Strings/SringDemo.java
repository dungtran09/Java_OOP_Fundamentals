import java.util.ArrayList;
import java.util.Arrays;

public class SringDemo {
    public static void main(String[] args) {
        String str = "Hello Word!";

        System.out.println("Length: " + str.length());
        System.out.println("Index at 0: " + str.charAt(0));

        str = str.concat(" My name is Dung");
        System.out.println(str);
 
        System.out.println(Arrays.toString(new int[]{1,2,3,4}));
        System.out.println(new Integer(56) + new ArrayList<>());
    }
}
