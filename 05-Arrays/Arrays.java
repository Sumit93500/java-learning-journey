public class Arrays {
  public static void main(String[] args) {
      int nums[] = new int[5];

      //Assigning the values
      for(int i=0;i<nums.length;i++){
        nums[i] = i+1;
      }

      //printing the array
      for(int i=0;i<nums.length;i++){
        System.out.println(nums[i]);
      }
  }
}
