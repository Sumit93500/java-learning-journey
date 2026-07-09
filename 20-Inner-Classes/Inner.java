
class A {

    int age;

    public void show() {
        System.out.println("In class A ");
    }

    //Inner Class---------------------------
    class B {

        public void config() {
            System.out.println("In class B ");
        }
    }
}

public class Demo {

    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();  //This is the only way to access inner class(class B here).(obj is object of class A here)
        obj1.config();
    }
}
