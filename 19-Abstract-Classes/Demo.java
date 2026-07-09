//The abstract keyword is used to achieve abstraction, which means hiding implementation details and showing only the essential functionality.

abstract class Car
{
  public abstract void drive();  // an method can only be abstract if and only if the class is abstract
  
  public void playMusic()
  {
    System.out.println("Play Music");
  }
}

class ScoripoN extends Car {
  public void drive(){  //It is mandatory to use an abstract method of parent class
    System.out.println("Driving a car");
  }
}


public class Demo {
  public static void main(String[] args) {

    // Car obj = new Car(); //We can't create object of abstract class

    ScoripoN car = new ScoripoN(); //We can create object of child class and can access methods of abstract class
    car.drive();
    car.playMusic();
  }
}
