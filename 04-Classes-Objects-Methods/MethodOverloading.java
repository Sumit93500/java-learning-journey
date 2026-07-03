public class MethodOverloading {
  public static void main(String[] args) {
    Calculator cal = new Calculator();
    System.out.println(cal.add(4,5));
    System.out.println(cal.add(4,5,6));
  }
}

class Calculator{
  public int add(int n1, int n2){
    return n1+n2;
  }

  public double add(double n1, double n2){
    return n1+n2;
  }

  public int add(int n1, int n2, int n3){
    return n1+n2+n3;
  }
}
