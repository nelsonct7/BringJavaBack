package package1;
import package1.package2.InnerClass; // you can use * after the . to import all the classes in that package
// import package1.*; // this wont import the package inside this package, only the classes or files will be imported

public class Main {
    public static void main(String art){
        InnerClass innerClassObj=new InnerClass();
        innerClassObj.printFromInnerClass();
    }
}
