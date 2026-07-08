final class Calc
{
  public void show()
  {
    System.out.println("in Calc show");

  }

  public void add(int a, int b)
  {
    System.out.println(a+b);
  }
}

class AdvCalc extends Calc
{
  public void show()
  {
    System.out.println("in AdvCalc show");
  }

  public void add(int a, int b)
  {
    System.out.println(a*b);
  }
}



public class FinalClass {
  public static void main(String[] args) {
    Calc c = new Calc();
    c.show();
    c.add(10, 20);
  }
}
