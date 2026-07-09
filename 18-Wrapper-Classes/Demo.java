
//A Wrapper Class is a class that wraps (encapsulates) a primitive data type into an object.
// Java provides wrapper classes because many APIs and collections work with objects, not primitives.


public class Demo {
  public static void main(String[] args) {
    int num = 7;

     //whenever we see a line like we see on Integer, it means it is depricated

    Integer num1 = new Integer(8); //this is called boxing , taking a primitive value and storing that in primitive objectn called boxing

    Integer num2 = 10;  // It is better way to assign a value using wrapper class instead of we how we asssign in num1;

    Integer num3 = num; //This is called autoboxing, as num is automatically converted to object automatically when assigned to an Object class


    //if we want to fetch an value from Object class in primitive data types, we have to do it manually 

    int num5 = num3.intValue(); //This is called Unboxing
    
    //OR

    int num6 = num3; //This is called auto-unboxing

    //There are many operations that can be done using Wrapper Classes , 
    //One of them is, if the user wants to convert string into integer , 
    //It can be done with the help if parseInt() method in Integer class, for example--->
     String str = "12";
    int num7 = Integer.parseInt(str);

    System.out.println(num1);
    System.out.println(num2);
    System.out.println(num5);
    System.out.println(num6);

   
    System.out.println(num7);
  }
}
