package 22-Exceptions;

public class Demo1 {
  public static void main(String[] args) {
    // ---------------------------------Try With Multiple Catch Blocks---------------------------------

    String str = null;
    int[] nums = new int[5];

    try {
        System.out.println(nums[1]);
        System.out.println(nums[5]);
    } catch (ArithmeticException e) {
      System.out.println("Divide by zero. " + e);
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Stay in your limits " + e);
    }
    //At the end , use default catch block , incase if any exception exists, handled by this catch block.
    catch(Exception e){
      System.out.println("Error: " + e);
    }
  }
}
