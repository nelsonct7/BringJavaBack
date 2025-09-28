package Final;

// final variable, method, class

class A {
    final public void show() {
        System.out.println("Printing from A");
    }

    public void add(int a, int b) {
        System.out.println("Sum is " + a + b);
    }
}
// B can inherit from A
final class B extends A{
    
    // a final method can not be overridden in child class
    // child class need to use parent class method to work with,
    // public void show(){
    //     System.out.println("Printing from B");
    // }
}

// final in class scope stops the inheritance,
// a final class is not inheritable
// class C extends B{

// }

public class Demo {
    public static void main(String[] args) {
        final int a = 10;
        // a=9 final variable can not be reassigned ,its constant.
    }
}
