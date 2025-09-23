class Anonymous{
    Anonymous(){
        System.out.println("Object created for Anonymous");
    }
    public void printFrom(){
        System.out.println("Printing from Anonymous");
    }
}
class Referenced{
    Referenced(){
        System.out.println("Object created for Referenced object");
    }
    public void printFrom(){
        System.out.println("Printing from Referenced");
    }
}

public class AnonymousAndReferenced {
    public static void main(String[] args) {
        new Anonymous().printFrom();
        new Anonymous().printFrom(); // this is an anonymous object which is not stored in a reference variable
        System.out.println();
        Referenced obj=new Referenced(); // this is referenced object which is stored in a reference variable so can be reused
        obj.printFrom();
        obj.printFrom();
    }
}
