package Interface;
// there are different types of interfaces available

// Normal => when an interface has more than two function declarations its normal
// Functional/SAM => if an interface has only one function declaration then its called Single Abstract Method (SAM) interface
// Marker => A marker interface is an interface which has no function declaration, this is mainly used to perform serialization and deserialization, serialization => write to hard drive, deserialization => write from hard drive

@FunctionalInterface
interface A {
    public void show();
}

interface FunctionalA {
    void operation(int a, int b);
}

interface SingleFunctionA {
    void show(int a);
}

interface Summer {
    int sum(int a, int b);
}

class B implements A {
    public void show() {
        System.out.println("Printing from class B");
    }
}

public class Types {
    public static void main(String[] args) {
        // you can override a interface function and use the object to call the method
        B obj = new B();
        obj.show();
        // from Java8 onwards the java team implemented the Lamda functions using
        // functional interface
        // with the help of anonymous inner class
        // anonymous inner class
        A obj1 = new A() {
            public void show() {
                System.out.println("Printing from the anonymous inner class of interface A");
            }
        };
        obj1.show();
        // Lamda expression ->
        A obj2 = () -> {
            System.out.println("Printing from the lamda function using functional interface A");
        };
        obj2.show();
        // to optimize you can use one liner if the code is one line
        A obj3 = () -> System.out.println("Printing from lamda function optimized version");
        obj3.show();
        // if values need to be passed you can define the lamda function like that
        FunctionalA obj4 = (int a, int b) -> System.out.println("Sum is " + a + b);

        obj4.operation(5, 2);
        // when you define the data type in functional interface, no need to use it in
        // the lamda function
        FunctionalA obj5 = (a, b) -> System.out.println("Sum is " + a + b);
        obj5.operation(8, 8);

        // if your function interface has only one variable in it, then you dont need to
        // use bracket when you define the lamda function
        SingleFunctionA obj6 = a -> System.out
                .println("Value passed in to single variable received lamda function is " + a);
        obj6.show(8);

        // functional interface with return type
        Summer obj7 = (a, b) -> a + b;
        System.out.println("Sum is " + obj7.sum(7, 8));

        // we can pass lamda function as an argument to certain functions too.
    }
}
