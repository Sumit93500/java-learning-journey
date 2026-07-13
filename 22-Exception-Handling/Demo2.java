

public class Demo2 {
  public static void main(String[] args) {
    int i = 20;
    int j = 0;
    try 
    {
        j = 18/i;
        if(j==0){
          throw new ArithmeticException();  // Concept of throw, used to call catch block
        }
    }
    catch(ArithmeticException e){
      System.out.println("Divide by zero " + e);
    }
    catch (Exception e) 
    {
      System.out.println("Something went wrong " + e );
    }
    System.out.println("Byy");
    System.out.println(j);

  }
}
