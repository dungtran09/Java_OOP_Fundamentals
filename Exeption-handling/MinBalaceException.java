public class MinBalaceException extends Exception {
  public MinBalaceException() {
    System.out.println("Balance is low.");
  }

  public static void main(String[] args) {

    try {
      int[] AccountNumber = {101, 102, 103, 104, 105, 106};
      double[] balance = {900, 2000, 1500, 1560, 1756.5};
      System.out.println("Acc No\t\t" + "Balance\t");

      for (int i = 0; i < AccountNumber.length; i++) {
        System.out.println(AccountNumber[i] + "\t\t" + balance[i]); 

        if (balance[i] < 1000) {
          throw new MinBalaceException();
        }
      }
    } catch (MinBalaceException e) {
      System.out.println("Exception caught.");
    }
  }
}
