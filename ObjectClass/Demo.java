package ObjectClass;

// Object class is the top class of every object that getting created in java

// every object can access the method of the Object class, since every class extends this Object class

class Laptop {
    String model;
    int price;
}

public class Demo {
    public static void main(String[] args) {
        Laptop obj=new Laptop();
        obj.model="Lenovo think pad";
        obj.price=75000;

        System.out.println(obj); // => ObjectClass.Laptop@251a69d7 :every time we print an object, the .toString() method in Object class is called by default

    }
}
