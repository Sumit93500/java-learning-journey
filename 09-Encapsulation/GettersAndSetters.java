public class GettersAndSetters {
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

  //Getter
  public int getAge(){
    return age;
  }

  //Setter
  public void setAge(int age){
    this.age = age;
  }

  //Getter
  public String getName(){
    return name;
  }

  //Setter
  public void setName(String name){
    this.name = name;
  }
}
