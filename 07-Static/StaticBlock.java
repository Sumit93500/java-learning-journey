
public class StaticBlock{

    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 150000;
        Mobile.name = "Phone";
        Mobile.show1();

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 77000;
        Mobile.show1();

        obj1.show();
        obj2.show();
        // Mobile.show1();
    }
}

class Mobile {

    String brand;
    int price;
    static String name = "Smartphone";

    static {
        name = "Phone";
        System.out.println("In Static Block");
    }

    public Mobile(){
        brand = "";
        price = 200;
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1() {
      System.out.println("in static method");
    }
}
