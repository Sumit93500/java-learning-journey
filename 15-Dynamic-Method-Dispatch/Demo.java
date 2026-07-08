class A{
  public void show(){
    System.out.println("In A");
  }
}

class B extends A{
  public void show(){
    System.out.println("In B");
  }
}

public class Demo {
  public static void main(String[] args) {
    A obj = new A();  
  obj.show();

  obj = new B();
  //Here we are creating an object of class B but referring it with a reference variable of class A. This is an example of runtime polymorphism in Java, where the method to be executed is determined at runtime based on the actual object type (which is B in this case).
  obj.show();

  }
}
