public class ConstructorExample {
  public static void main(String[] args) {
      Human h1 = new Human(21);
      System.out.println(h1.age);

  }
}

class Human{
  int age;
  public Human(){
    System.out.println("IN Constructor");
  }

  public Human(int age){
    this.age = age;
  }
}
