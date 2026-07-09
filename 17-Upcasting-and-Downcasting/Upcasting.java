class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Upcasting {
    public static void main(String[] args) {

        Animal animal = new Dog();   // Upcasting

        animal.sound();
    }
}