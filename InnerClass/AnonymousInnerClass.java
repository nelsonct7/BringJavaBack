package InnerClass;

class A {
    public void show() {
        System.out.println("printing from show method in class A");
    }
}

abstract class AbstractA{
    public abstract void abstractShow();
}



public class AnonymousInnerClass {
    public static void main(String[] args) {
        // this is accessing the show method defined in the A class
        A obj = new A();
        obj.show();
        // to create an anonymous inner class, when you define the object reference,
        // also add a curly brace {}, and define the required fields in it
        // the contents in { } will be considered as inner class of the class A and if
        // you want you can override or add new features for temporary use cases
        A objRef = new A() {
            int counter = 1;

            public void show() {
                System.out.println("Printing from the anonymous inner class. ");
                this.incrementCounter();
            }

            private void incrementCounter() {
                this.counter++;
            }
        };
        objRef.show(); // this will print the new define show

        // we can define the definitions of an abstract class like this and use the features
        // with upcasting support the type of the Abstract class hold the ref of the anonymous class
        // and we can use the object reference to access the fields defined in the anonymous class.
        AbstractA obj1=new AbstractA() {
            public void abstractShow(){
                System.out.println("Printing from the abstract class's defined function");
            }
        };
        obj1.abstractShow();
    }
}
