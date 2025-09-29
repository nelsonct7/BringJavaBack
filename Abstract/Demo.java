package Abstract;

// only an abstract class can contain the abstract methods,
// abstract class can contain abstract and non abstract methods
// abstract class may or may not contain abstract methods.
// you can not instantiate an abstract call object
// you need to create the instance of a child class to use the functionality of the abstract class.
abstract class Car{
    // abstract method gives the idea to child class what need to implemented to use the parent class features
    public abstract void drive();
    public void playMusicSystem(){
        System.out.println("Playing music for car...");
    }
}

// concrete class
class Wagonr extends Car{
    public void drive(){
        System.out.println("Driving in Wagonr");
    }
}

public class Demo {
    public static void main(String[] args) {
        // Car obj=new Car(); // abstract class cannot be instantiated
        Car car1=new Wagonr();
        car1.drive();
        car1.playMusicSystem();
    }
}
