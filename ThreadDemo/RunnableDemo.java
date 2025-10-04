package ThreadDemo;

// ShowClass only performing the print operation
// I added this class so I dont want to write the code repeatedly
class ShowClass {
    public void show(String message) {
        for (int i = 0; i < 100; i++) {
            System.out.println(message);
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                // TODO: handle exception
                System.err.println("Failed to sleep the thread");
            }
        }
    }
}

class ARunnable extends ShowClass implements Runnable {
    @Override
    public void run() {
        this.show("Hello A");
    }
}

class BRunnable extends ShowClass implements Runnable {
    @Override
    public void run() {
        this.show("Hai B");
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        // runnable interface does not have start method.
        Runnable obj1 = new ARunnable();
        Runnable obj2 = new BRunnable();
        // to make the threads execute, we use the parameterized constructor in Thread
        // class
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

        // Using Lambda expression, we can make the thread work
        // Option1 using anonymous class
        Runnable obj3 = new Runnable() {
            @Override
            public void run() {
                ShowClass shObj = new ShowClass();
                shObj.show("Hello from Anonymous class invoked thread");

            }
        };
        // Option 2 using the Lambda expression,
        // Runnable interface is a functional interface ,and it has only run method
        // defined in it.
        Runnable obj4 = () -> {
            ShowClass shObj1 = new ShowClass();
            shObj1.show("Hai from the Lambda expression.");
        };

        // now pass the objects created using Runnable interface reference in to the
        // Thread class constructor.
        Thread t3 = new Thread(obj3);
        Thread t4 = new Thread(obj4);
        t3.start();
        t4.start();
    }
}
