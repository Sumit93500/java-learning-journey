public class ConditionalStatements {
  public static void main(String[] args) {
    int x = 8;

    //if-else
    if(x<0){
      System.out.println("Heyy there, Hope you are working good");
    }
    else 
    {
      System.out.println("You are a great person");
    }

    //if else-if else
      if(x<0){
        System.out.println("Number is smaller than 0");
      } else if(x>0 && x<10){
        System.out.println("Number is between 0 and 10");
      } else {
        System.out.println("Number is greater than 10");
      }

      //ternary operator
      int y = (x>0)? 1:0;
      System.out.println(y);
  }
}
