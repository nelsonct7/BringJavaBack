package ThreadDemo;

class Counter {
    int count = 0;

    // to make the method work in syn we just need to add a key word to the function
    // that need to be worked in sync when multiple threads call that function
    public synchronized void increment() {
        count += 1;
    }
}

public class FixRaceCondition {
    public static void main(String[] args) {
        Counter obj = new Counter();
        // lambda expression for runnable
        Runnable obj1 = () -> {
            for (int i = 0; i < 1000; i++) {
                obj.increment();
            }
        };

        // lambda expression for runnable
        Runnable obj2 = () -> {
            for (int i = 0; i < 1000; i++) {
                obj.increment();
            }
        };

        Thread obj3 = new Thread(obj1);
        Thread obj4 = new Thread(obj2);

        obj3.start();
        obj4.start();

        try {
            obj3.join();
            obj4.join();
        } catch (Exception e) {
            System.err.println("Failed to join the two threads.");
        }
        System.out.println("==== The incremented result after synchronizing is " + obj.count);
    }
}
