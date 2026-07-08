//Super() is explained first, then this() is explained 

class A {
    public A(){
      System.out.println("in A");
    }

    public A(int n){
      System.out.println("in A int");
    }
}

class B extends A{
  public B()
  {
    super(); //Even if we do not write it , it exists by default. It will call the parent class constructor with no arguments.
    System.out.println("in B");
  }
  public B(int n){
    super(10); // It will call the parent class constructor with the specified argument.
    System.out.println("in B int");
  }



//if i want my output like this ---> 

//in A
//in B
//in B int

//then in that case, we have to use this() 
//this is used to call constructor of own class whom object is created(class B here)

//  public B(int n){
//     this(); // It will call the its own constructor with the specified argument.
//     System.out.println("in B int");
//   }

}



public class Demo {
  public static void main(String[] args) {
    B obj = new B();
  }
}
