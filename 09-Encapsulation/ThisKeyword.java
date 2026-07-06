
//this is a reference variable in Java that points to the current object on which a method or constructor is invoked.1
// Here there are two variables named age:

// this.age → the instance variable (the variable inside the object)
// age → the local variable (the parameter of the method)
// Without this, Java gets confused about which age you mean.

public class ThisKeyword {
  public static void main(String[] args) {
    Human h1 = new Human();
    h1.setAge(21);
    h1.setName("Sumit");
    h1.display();
  }
}

class Human {
  private int age;
  private String name;

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  void display() {
    System.out.println("Age: " + age);
    System.out.println("Name: " + name);
  }
}
