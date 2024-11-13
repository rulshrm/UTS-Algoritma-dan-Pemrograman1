public class UTS2 {
  public static void main(String[] args) {
    int a = 65;
    int b = 70;
    a = a | b;
    b = a << b;
    if (a < b) {
      System.out.println("Nilai " + a + " kecil");
    } else {
      System.out.println("Nilai " + b + " kecil");
    }
  }
} // Output: Nilai 71 kecil