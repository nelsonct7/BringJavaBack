package InnerClass;

class A {
    int var1 = 10;

    public void show() {
        System.out.println("Printing from show method " + var1);
    }

    public class InnerClassA {
        public void showConfig() {
            System.out.println("Printing from Inner class ");
        }
    }

    public static class C {
        static public void staticShow() {
            System.out.println("Printing from the static class C");
        }

        public void nonStaticShow() {
            System.out.println("Printing from non static in class C");
        }
    }
}

public class Demo {
    public static void main(String args[]) {
        A obj1 = new A();
        obj1.show();

        // to access an inner class of a class, you nee to instantiate it first.
        // to instantiate an inner class object you need the parent class object first.
        A.InnerClassA obj2 = obj1.new InnerClassA();
        obj2.showConfig();
        // you can declare a class as static if its an inner class,
        // but you can not create a class static if its outer class
        A.C.staticShow();
    }
}
