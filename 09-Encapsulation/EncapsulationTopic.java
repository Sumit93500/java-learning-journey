
// Encapsulation is the process of wrapping data (variables) and methods (functions) into a single unit (class) and restricting direct access to the data.

// In Java, encapsulation is achieved by:

// Making variables private
// Providing public getter and setter methods to access and modify them

public class EncapsulationTopic {
  public static void main(String[] args) {
    Human obj = new Human();
    obj.setAge(21);
    obj.setName("Sumit");
    System.out.println(obj.getAge());
    System.out.println(obj.getName());
  }
}

class Human {
  private int age;
  private String name;

  public int getAge(){
    return age;
  }

  public void setAge(int age){
    this.age = age;
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }
}
