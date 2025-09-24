package Inheritance;

class Parent1 {
    public void show() {
        System.out.println("Printing from parent1");
    }

}

class Parent2 extends Parent1 {
    public void show() {
        System.out.println("Printing from parent2");
    }
}

class Child extends Parent2 {
    public void show() {
        System.out.println("Printing from child");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        System.out.println("Using child object you can call the show method, but it will not go to parent if its defined in the child");
        Child childObj=new Child();
        childObj.show();
    }
}
