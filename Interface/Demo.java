package Interface;

// interface is a class, all methods in interface is abstract by default.
// we cannot instantiate an interface, but you can create a reference, as a type, but can use it after the new key word

interface InnerDemo {
    // all variables declared in interface is final and static
    int value = 258;
    String name = "Nelson Chittilappilly";

    void printer();

    void enter();
}

interface InnerDemo_1 {
    void run();
}

// interfaces can extend other interfaces, no need to define the functions like when it get implemented in other classes

interface InnerDemo_2 extends InnerDemo {
    void secondPrinter(int x);
}

class InterfaceHolderSecond implements InnerDemo_2{
    public void secondPrinter(int x){
        System.out.println("Printing from the second interface over ridden class "+x);
    }
    public void printer(){
        System.out.println("Printing from the first interface over ridden method");
    
    }
    public void enter(){
        System.out.println("Printing from the first inter face enter method");
    }
}

// we can implement multiple interfaces
class InterfaceHolder implements InnerDemo,InnerDemo_1 {
    // first interface function definitions
    public void printer() {
        System.out.println("Printing from logger ");
    }

    public void enter() {
        System.out.println("Enter working");
    }
    // second interface function definitions
    @Override
    public void run() {
        System.out.println("Running from second interface function definition");
    }
}

public class Demo {
    public static void main(String[] args) {
        InterfaceHolder refObj = new InterfaceHolder();
        refObj.enter();
        refObj.printer();
        System.out.println(
                "The variables from Interface is directly accessible " + InnerDemo.value + " : " + InnerDemo.name);

    }
}
