
// An Anonymous Inner Class is a class without a name.
// It is declared and instantiated at the same time.
// It is used when you need to override a method or implement an interface for one-time use.
// It avoids creating a separate subclass.

class A {

    // Normal method of class A
    public void show() {
        System.out.println("in show A");
    }
}

public class AnonymousInnerClass {

    public static void main(String[] args) {

        // Here we are NOT creating a normal object of A.
        // We are creating an Anonymous Inner Class.
        // It is a class with NO NAME that extends class A.
        A obj = new A() {

            // This method overrides the show() method of class A
            public void show() {
                System.out.println("in new Show");
            }
        };

        // Calls the overridden method of the anonymous class,
        // not the original show() method of class A.
        obj.show();
    }
}