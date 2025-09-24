package Inheritance;

class Parent {
    public void parentPrinter() {
        System.out.println("Printing from parent ");
    }
}

class Child extends Parent {
    public void childPrinter() {
        System.out.println("Printing from Child");
    }
}

class SubChild extends Child {
    public void subChildPrinter() {
        System.out.println("Printing from Sub Child");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        SubChild subChildObj = new SubChild();
        subChildObj.subChildPrinter();
        subChildObj.childPrinter();
        subChildObj.parentPrinter();
    }
}
