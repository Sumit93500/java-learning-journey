
//Method Overloading is Compile Time Polymorphism in Java. It allows a class to have more than one method with the same name, but different parameters (either in number, type, or both). The correct method to call is determined at compile time based on the method signature.

class Calculator {

    // Method 1
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3
    public double add(double a, double b) {
        return a + b;
    }
}

public class CompileTimePolymorphism {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println(calc.add(10, 20));
        System.out.println(calc.add(10, 20, 30));
        System.out.println(calc.add(10.5, 20.5));
    }
}
