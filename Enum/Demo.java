package Enum;

// user defined data types
// enum can not be extended like class,
// but it can do everything else a class can do, like constructor, variables, methods..etc
// if you declare an enum it bydefault extends an Enum class
enum Status {
    Running, Failed, Pending, Success
}

enum Laptop {
    Mackbook(200), xpx(522), surface(54456), Thinkpad(859);

    private Laptop() {
        price = 5000;
    }

    private Laptop(int value) {
        this.price = value;
    }

    private int price;

    public int getter() {
        return this.price;
    }

    public void setter(int val) {
        this.price = val;
    }
}

public class Demo {
    public static void main(String[] args) {
        Status s = Status.Pending;
        System.out.println("Status " + s);
        System.out.println("Ordinal " + s.ordinal());
        System.out.println("All values in Status " + Status.values());
        // above print will give the hashed values
        // use for loop to do that it will give with order
        for (Status ss : Status.values()) {
            System.out.println("individual value of " + ss);
        }
        // change s to success
        s = Status.Success;
        switch (s) {
            case Failed:
                System.out.println("Process failed");
                break;
            case Pending:
                System.out.println("Process pending");
                break;
            case Running:
                System.out.println("Process running");
                break;
            case Success:
                System.out.println("Process success");
                break;
            default:
                System.out.println("Process is in unknown state");
                break;
        }
        // all enums extends it super class enum
        System.out.println("Super class on enum is " + s.getClass().getSuperclass());

        Laptop lap = Laptop.Mackbook;
        System.out.println("Laptop " + lap + " Price : " + lap.getter());
    }
}
