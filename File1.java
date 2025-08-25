// static key word, used to save the memory

class Mobile {
    // instance variable
    String brand = "Initializing brand";
    int price = 0;
    String name = "Initializing name";
    // static variable
    static String variant = "Mobile phone";

    // static block,
    // this will be called only once, and it will be called before the constructor
    // get called,
    // when we create an object the class will be loaded first and the object will
    // be instantiated
    // in JVM there is a class loader, it is responsible for loading the class, only
    // after jvm loads the class the instances will be
    // allocated, so static method will be called at first, the constructors will be
    // called then after.
    // if you dont instantiated the object, the class will not be loaded
    // if you want to load your class without instantiating the object, the
    // Class.forName() method can be used
    static {
        System.out.println("------- Static block executed");
    }

    // constructor will be called all the times the instance is instantiated
    public Mobile() {
        System.out.println("***** Constructor is called");
    }

    public void show() {
        System.out.println("Brand " + brand + "\nPrice " + price + "\nName " + name + "\nVariant " + variant);
    }

    public static Mobile getData() {
        // this key word is not allowed in static method
        // only static variable can be used inside the static methods
        Mobile ref = new Mobile();
        return ref;
    }
}

public class File1 {
    // static variables are shared across multiple objects, as single origin of
    // truth
    public static void main(String[] args) throws ClassNotFoundException {

        // loads the class even without the object instantiation
        Class.forName("Mobile");

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 30000;
        obj1.name = "New One";
        obj1.show();

        // if we change the value of the static variable in one object it will effect
        // the other ones too
        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 15000;
        obj2.name = "New one";
        obj2.show();
        // obj2 changes the static variable value, which will be effected in other
        // objects
        obj2.variant = "New Static value from obj2";

        Mobile obj3 = new Mobile();
        obj3.brand = "Opo";
        obj3.price = 50000;
        obj3.name = "New One";
        obj3.show();

        // we should call the static variable using the class name, the above warning
        // means that
        System.out.println("Static variable " + Mobile.variant);
        // static functions can be accessed using class name
        Mobile refHolder = Mobile.getData();
        System.out.println("Initialized values " + refHolder.brand);

    }
}
