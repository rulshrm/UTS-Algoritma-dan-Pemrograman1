public class UTS1 {
  public static void main(String[] args) {
    int a = 65;
    int b = 70;
    a = a & b;
    b = b >> 2;
    if (a < b) {
      System.out.println("Nilai " + a + " kecil");
    } else {
      System.out.println("Nilai " + b + " kecil");
    }
  }
} // Output: Nilai 17 kecil