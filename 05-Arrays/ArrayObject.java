public class ArrayObject {
  public static void main(String[] args) {
    Student students[] = new Student[3];

    Student s1 = new Student();
    s1.roll = 1;
    s1.name = "Sumit";
    s1.marks = 85;

    Student s2 = new Student();
    s2.roll = 2;
    s2.name = "Rohit";
    s2.marks = 79;

    System.out.println(s1.name);
  }
   
  }

  class Student{
    int roll;
    String name;
    int marks;
  }

