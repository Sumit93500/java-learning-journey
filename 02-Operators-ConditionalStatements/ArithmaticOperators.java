class ArithmaticOperators {
  public static void main(String[] args) {
    int num1 = 7;
    int num2 = 5;

    //Addition
    int add = num1+num2;
    System.out.println(add);
    //Subtract
    int subtract = num1-num2;
    System.out.println(subtract);
    //Multiplication
    int multiply = num1*num2;
    System.out.println(multiply);
    //Division
    int divide = num1/num2;
    System.out.println(divide);
    //Modulous
    int modulous = num1%num2;
    System.out.println(modulous);



    //other way to do the operations
    int a = 10;
    //add
    System.out.println(a+=2);
    //subtract
    System.out.println(a-=3);
    //mul
    System.out.println(a*=2);
    //divide
    System.out.println(a/=2);



    //increment & decrement

    int b = 2;
    //post-increment
    b++;
    System.out.println(b);
    //post-decrement
    b--;
    System.out.println(b);
    
    int c = 3;
    //pre-increment
    ++c;
    System.out.println(c);
    //post-decrement
    --c;
    System.out.println(c);
  }
}