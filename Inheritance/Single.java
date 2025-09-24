package Inheritance;

class Parent {
    public void printer() {
        System.out.println("Printer from Parent");
    }
}

class Child extends Parent {
    public void printChild() {
        System.out.println("Pinter from Child");
    }
}

public class Single {
    public static void main(String[] args) {
        Child childObj = new Child();
        childObj.printChild();
        childObj.printer();
    }
}
