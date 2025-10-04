package ThreadDemo;

// Thread priority 1-10 => 1 least, 10 higher

class ThreadA extends Thread {
    private void show() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello A " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println("Failed to put there A to sleep");
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {

        super.run();
        this.show();
    }
}

class ThreadB extends Thread {
    private void show() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hai B " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.err.println("Failed to put there b to sleep");
                e.printStackTrace();
            }
        }
    }

    @Override
    public void run() {

        super.run();
        this.show();
    }
}

public class Demo1 {
    public static void main(String[] args) {
        ThreadA obj1 = new ThreadA();
        ThreadB obj2 = new ThreadB();

        System.out.println("Priority of ThreadA " + obj1.getPriority());
        System.out.println("Priority of ThreadB " + obj2.getPriority());

        // set the priority
        // even if we set the priority , the scheduler is still controlling the
        // execution order, we can only suggest, but there is no guarantee
        // obj1.setPriority(5);
        // obj2.setPriority(10);

        System.out.println("Priority after changing of ThreadA " + obj1.getPriority());
        System.out.println("Priority after changing of ThreadB " + obj2.getPriority());

        obj1.start();
        obj2.start();
    }
}
