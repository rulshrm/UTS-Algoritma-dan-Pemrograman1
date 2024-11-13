public class UTS14 {
  public static void main(String[] args) {
    int a = 18;
    int b = 36;
    a += b;
    if (a % 3 == 1) {
      a >>= 2;
      System.out.println("nilai " + a + " oke");
    } else {
      b <<= 2;
      System.out.println("nilai " + b + " oke");
    }
  }
} // Output: nilai 144 oke