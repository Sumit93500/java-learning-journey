
//Method overriding is a feature that allows a subclass to provide a specific implementation of a method that is already defined in its superclass. It enables runtime polymorphism, where the method to be executed is determined at runtime based on the object type.


class Animal {

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class RunTimePolymorphism {

    public static void main(String[] args) {

        Animal animal = new Dog();

        animal.sound();
    }
}