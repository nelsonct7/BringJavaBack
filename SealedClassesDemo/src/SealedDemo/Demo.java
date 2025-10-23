package SealedDemo;

/*
 * Sealed classes are used to limit the number of classes that can extend the parent class
 * a sealed  class can be only extended by thew permitted classes, other  classes can not extend it
 * and if a class want to extend a sealed class it should be either a non-sealed,sealed, or final class.
 * in case of interfaces the sealed interface can be extended to a non-sealed or sealed interfaces, since interfaces can not be final
 * 
 */

sealed class A extends Thread implements Cloneable permits B,C,D{
	public void printHello() {
		System.out.println("Hello from Class A");
	}
}

final class B extends A{
	
}
non-sealed class C extends A{
	
}
sealed class D extends A permits E{
	
}

final class E extends D{
	
}

sealed interface X permits Y{
	
}
non-sealed interface Y extends X{
	
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B objRefB=new B();
		C objRefC=new C();
		D objRefD=new D();
		E objRefE=new E();
		
		System.out.println("Printing using B reference ");
		objRefB.printHello();
		
		System.out.println("Printing using C reference ");
		objRefC.printHello();
		
		System.out.println("Printing using D reference ");
		objRefD.printHello();
		
		System.out.println("Printing using E reference ");
		objRefE.printHello();
		
	}

}
