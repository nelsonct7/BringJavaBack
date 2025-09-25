package AccessModifiers;

import AccessModifiers.other.*;

public class Demo {

    // PUBLIC
    // if something needs to be accessible to outside package always declare it as
    // public
    // public means it can be accessed from anywhere, normally all the methods are
    // defined public so the class can do something

    // DEFAULT
    // default can be access with in the package, not outside the package
    int defaultMark=60;

    // PROTECTED
    // protected members can not be used outside the package
    // but it can be accessed outside the package if the class referring to the variable is a derived class of the base class from different package, that has the protected variable in it.
    protected int extraMarks=40;
    // PRIVATE
    // private variable can be used in the class only, and it can not be used
    // outside the class
    private int privateMarks = 36;

    public void printPrivateMarks() {
        System.out.println("Private variables can be used with in the class only " + this.privateMarks);
    }

    public static void main(String[] args) {
        ClassA obj = new ClassA();
        // System.out.println("Marks in ClassA "+obj.marks); // since the marks is
        // defined in ClassA and ClassA is public but the marks in ClassA is not public
        // so its not visible here and its from different package

        // marks in obj1 is visible bcz ClassB is public, and marks is public. and its
        // from another package
        ClassB obj1 = new ClassB();
        System.out.println("Marks in ClassB " + obj1.marks);

        // but the class is in same package, the game changes
        // you can access the non public class and its non public variable in the same
        // package
        ClassA1 obj2 = new ClassA1();
        System.out.println("Marks in ClassA1 " + obj2.marks);

        // --------------------------------------------------
        Demo demoObj = new Demo();
        demoObj.printPrivateMarks();

        // protected members can not be used outside the package
        // System.out.println("Protect value of extramarks in ClassA is not accessible here"+obj.extraMarks);
    }
}
