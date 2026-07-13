// An interface in Java is a blueprint that defines a contract for classes. It specifies what operations a class must perform without describing how those operations should be implemented.

// Any class that implements an interface is required to provide implementations for all of its abstract methods.

// How an Interface Works
// An interface declares one or more methods.
// A class implements the interface using the implements keyword.
// The implementing class must define all abstract methods.
// Objects of the implementing class can be referred to using the interface reference, enabling runtime polymorphism.

// Rules of Interface in Java
// An interface is declared using the interface keyword.
// An interface cannot be instantiated, which means objects of an interface cannot be created directly.
// A class implements an interface using the implements keyword.
// A class implementing an interface must provide implementations for all its abstract methods; otherwise, the class must be declared abstract.
// All abstract methods in an interface are implicitly public and abstract.
// All variables declared in an interface are implicitly public, static, and final, making them constants.
// Interfaces do not have constructors because they cannot be instantiated.
// An interface can extend one or more interfaces, but it cannot extend a class.
// A class can implement multiple interfaces, allowing Java to support multiple inheritance of type.
// Interfaces support abstraction by specifying what a class must do without defining how it should do it (for abstract methods).
// Since Java 8, interfaces can contain default and static methods with implementations.
// Since Java 9, interfaces can also contain private methods to support code reuse within the interface

// -----------------------------------------Example-----------------------------------------


interface A {
  void show();
  void config();
}

class B implements A{
  public void show(){
    System.out.println("Car A implemented");
  }
  public void config() {
    System.out.println("Config of b implemented");
  }
}

class Demo{
  public static void main(String[] args) {
    B obj = new B();
    obj.show();
    obj.config();
  }
}