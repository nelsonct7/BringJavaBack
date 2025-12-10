class Demo1{
    Demo1(){
        super(); // this line will be the first in every constructor, and it calls the Object class in java,
        System.out.println("Printing from the parent class");
    }
    Demo1(int num){
        this(); // calls the above default constructor
        System.out.println("Number from parent class is "+num);
    }
}

class Demo2 extends Demo1{
    Demo2(){
        super();
        System.out.println("Default constructor in child class.");
    }
    Demo2(int num){
        this();
        System.out.println("Parameterized constructor from child class "+num);
        Demo1 demo1Obj=new Demo1(num);

    }
}



public class ThisSuper {
    public static void main(String[] args) {
        System.out.println("initiating object from main");
        Demo2 demo2Obj=new Demo2(20);
    }
}
