package ThreadDemo;

class A {
    public void show() {
        for (int i = 0; i < 10; i++) {
            System.out.println("\n");
            for (int j = 0; j < i; j++) {
                System.out.println(" " + j);
            }
        }
    }
}

class B {
    public void show() {
        for (int i = 0; i < 10; i++) {
            System.out.println("\n");
            for (int j = 0; j < i; j++) {
                System.out.println(" " + j);
            }
        }
    }
}

class A1 extends Thread {
    public void show() {
        for (int i = 0; i < 100; i++) {
            System.out.println("\n");
            for (int j = 0; j < i; j++) {
                System.out.println("Thread A1 " + j);
            }
        }
    }

    @Override
    public void run() {
        super.run();
        show();
    }
}

class B1 extends Thread {
    public void show() {
        for (int i = 0; i < 100; i++) {
            System.out.println("\n");
            for (int j = 0; j < i; j++) {
                System.out.println("Thread B1 " + j);
            }
        }
    }

    @Override
    public void run() {
        super.run();
        show();
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        // main stops here and wait for show to complete
        obj1.show();
        // once above show is done, main executes below show
        obj2.show();

        // if we want make them in parallel we use thread
        A1 objA12 = new A1();
        B1 objB12 = new B1();
        // Scheduler controls the cpu allocation to thread
        objA12.start();
        objB12.start();

    }
}
