public class UTS13 {
  public static void main(String[] args) {
    int a = 18;
    int b = 36;
    b |= 32;
    if (b % 3 == 1) {
      System.out.println("nilai " + a + " oke");
    } else {
      b *= 4;
      System.out.println("nilai " + b + " oke");
    }
  }
} // Output: nilai 144 oke