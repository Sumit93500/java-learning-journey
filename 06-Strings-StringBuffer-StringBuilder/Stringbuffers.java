import java.lang.StringBuffer;
public class Stringbuffers {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Sahil");
    System.out.println(sb);
    System.out.println(sb.capacity());
    System.out.println(sb.length());

    sb.append(" yadav");
    System.out.println(sb);

    sb.delete(2,5);
    System.out.println(sb);

    sb.insert(0, "Hello ");
    System.out.println(sb);

  }
}
