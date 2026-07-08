class A{
  final public void show()
  {
    System.out.println("in A show");
  }
}

class B extends A {
  public void show() //This gives error because we cannot override final method from class A
  {
    System.out.println("in B show");
  }
  public void add(int a, int b)
  {
    System.out.println(a+b);
  }
}

public class FinalMethod {
  public static void main(String[] args) {
    B b = new B();
    b.show();
  }
}
