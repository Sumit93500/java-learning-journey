public class TypecastingAndTypeconversion {
  public static void main(String args[]){
    byte b = 124;
    int a = 28;
    b =(byte)a; // Explicit conversion(Casting)
    System.out.println(b);

    float f = 5.8f;
    int x = (int)f; // Explicit conversion(Casting)
    System.out.println(x);

    byte s = 125;
    int t = s;  // implicit conversion(Type Conversion)
    System.out.println(t);

    int m = 24;
    float n = m; // implicit conversion(Type Conversion)  
    System.out.println(n);
  }
}
