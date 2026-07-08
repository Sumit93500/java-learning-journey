class A {
  public void show(){
    System.out.println("Show of A");
  }
  public void config(){
    System.out.println("Config of A");
  }
}

class B extends A {
  public void show(){
    System.out.println("Show of B");
  }
  public void config(){
    System.out.println("Config of B");
  }
}

public class MethodOverRiding{
  public static void main(String[] args) {
  B b = new B();
  b.show();
  }

}