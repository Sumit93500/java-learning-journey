public class ConstructorExample {
  public static void main(String[] args) {
      Human h1 = new Human(21);
      Human h2 = new Human();
      System.out.println(h1.age);

  }
}

class Human{
  int age;
  String name;

  //Default Constructor
  public Human(){
    this.name = "Sumit";
    this.age = 21;
  }

  //Parameterized Constructor
  public Human(int age){
    this.age = age;
  }
}
