
// An Enum (Enumeration) in Java is a special data type used to define a fixed set of constant values. It improves code readability, type safety, and maintainability by restricting variables to predefined values.

// For example, instead of storing the days of the week as strings, you can define them using an enum.
enum Status{
  Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}
public class Enums {
  public static void main(String[] args) {
    Status s = Status.Sunday;
    System.out.println(s.ordinal());
  }
}
