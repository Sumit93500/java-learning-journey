class A {
  public int a = 10;
}

class B{
  private int b = 20;
}

class C{
  protected int c = 30;
}

class AccessModifiers{
  public static void main(String[] args) {
    A a = new A();
    System.out.println(a.a);
    B b = new B();
    //System.out.println(b.b); // This will give an error because b is private
    C c = new C();
    System.out.println(c.c);
  }
}
