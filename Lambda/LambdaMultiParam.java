interface Addable {
  public int add (int a, int b);
}

public class LambdaMultiParam {
  public static void main(String[] args) {
    Addable a1 = (a, b) -> (a + b);
    System.out.println(a1.add(1996, 4));

    Addable a2 = (int a, int b) -> (a + b);
    System.out.println(a2.add(200, 800));
  }
}
