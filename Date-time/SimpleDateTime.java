import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateTime {
  public static void main(String[] args) {
    SimpleDateFormat fm = new SimpleDateFormat("hh:mm:ss dd/MM/yy");

    Date date = new Date();
    String getDate = fm.format(date);
    System.out.println(getDate);
  }
}
