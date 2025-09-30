package Annotation;

// annotations help compiler in compile time to detect the errors and point out to the developer
// in runtime also annotations will be applicable
// you can set the
@Deprecated
class A {
    // @SuppressWarnings
    public void show() {
        System.out.println("Printing from the A class");
    }
}

class B extends A {
    @Override
    public void show() {
        System.out.println("Printing form the class B");
    }

}

public class Demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
