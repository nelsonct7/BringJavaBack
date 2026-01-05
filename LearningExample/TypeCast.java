
class A {
    public void show() {
        System.out.println("Printing from A");
    }
}

class B extends A {
    public void showNew() {
        System.out.println("Printing from B");
    }
}

public class TypeCast {
    public static void main(String[] args) {
        double d = 4.5;
        // int i=d; // java wont allow to store mis matched data types in variables,
        // if you need to do it you need to type cast it, an ready to loss data
        int i = (int) d;
        // ------------------
        A obj = new A();
        obj.show();

        A obj1=(A) new B(); // this is upcasting, B is getting converted in to A
        obj1.show();    

        B obj2= (B) obj1; // this is down casting, where the obj1 is of type A but reference object is of B, and to use methods of B, we use down casting from parent to child.
        obj2.show();
        obj2.showNew();
    }
}
