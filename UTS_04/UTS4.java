package UTS_04;

public class UTS4 {
  public static void main(String[] args) {
    int a = 12;
    int b;
    a *= a;
    b = a ^ 45;
    if (a < b) {
      System.out.println("nilai " + a + " kecil");
    } else {
      System.out.println("nilai " + b + " kecil");
    }
  }
} //Output: nilai 144 kecil