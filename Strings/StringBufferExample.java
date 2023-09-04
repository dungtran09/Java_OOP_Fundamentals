public class StringBufferExample {
  public static void main(String[] args) {
    StringBuffer buffer = new StringBuffer();
    buffer.append("Hello ");
    buffer.append("Word");
    buffer.append("!");
    buffer.append("!");
    buffer.append("!");
    System.out.println(buffer.toString());

  }
}
