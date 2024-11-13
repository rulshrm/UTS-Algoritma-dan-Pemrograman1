public class UTS5 {
  public static void main(String[] args) {
    int a = 12;
    int b = 40;
    a+=b;
    b=a^b;
    if(a<b) {
      System.out.println("nilai " +a+ " kecil");
    } else {
      System.out.println("nilai " +b+ " kecil");
    }
  }
} //Output: nilai 28 kecil