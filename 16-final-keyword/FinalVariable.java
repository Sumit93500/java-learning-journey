public class FinalVariable {
  public static void main(String[] args) {
    final int x = 5;
    x = 6; // This will cause a compilation error because final variables cannot be reassigned.
    System.out.println(x);
  }
}
