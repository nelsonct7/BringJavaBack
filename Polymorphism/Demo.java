package Polymorphism;

class A{
    public void show(){
        System.out.println("In a show");
    }
}

class B extends A{
    public void show(){
        System.out.println("In b show");
    }
}

class C extends A{
public void show(){
        System.out.println("In c show");
    }
}

public class Demo {
    // poly => MANY + morphism => BEHAVIOR
    // same will have different behavior in different scenarios
    // mainly two types Compile time (Early binding) , Run time (Late binding)
    // if you can define the behavior in compile time its compile time polymorphism (Method overloading)
    // if you can define the behavior in run time, its run time polymorphism (Method overriding)
    /*
     * method over loading add(int a), add(int a,int b), add(string a,string b)
     * method overriding Parent class has add(int a,int b) and child class has same method with same params add(int a,int b), then this will be defined in the run time, which method to be called.
     */

     // DYNAMIC METHOD DISPATCH
     public static void main(String[] args) {
        // parent class can hold the reference object of child class
        A obj=new A();
        obj.show();
        obj=new B();
        obj.show();
        A obj1=new C();
        obj1.show();
        obj=obj1; // the references can be changed also using the parent class
        obj.show();

     }
}
