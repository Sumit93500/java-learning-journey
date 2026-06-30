public class LogicalOperators {
  public static void main(String[] args) {
    int num1 = 6;
    int num2 = 8;

    System.out.println(num1>num2 && num1<num2); //false
    System.out.println(num1>num2 || num1<num2); //true
    System.out.println(!(num1>num2)); //true
  }
}
