package JavaExceptions;
/*
 * In Java, 'throw' is used to explicitly throw an exception from a method or block of code.
 * 'throws' is used in a method signature to declare that the method might throw one or more exceptions.
 * Example:
 *   void myMethod() throws IOException {
 *       throw new IOException("Error occurred");
 *   }
 */

public class ThrowAndThrows {

    public void DemoThrows() throws ArrayIndexOutOfBoundsException {
        int[] a = new int[5];
        if (a[10] == 8) {
            System.out.println("Array out of bound");
        }
        // Deliberately throw an exception to demonstrate 'throws'
        throw new ArrayIndexOutOfBoundsException("Demo exception");
    }

    // never add throws to main method, if you throw from main method, JVM directly
    // calls this method, and if exception faced by JVM it stops execution
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        try {
            // this method throws the class not found exception,
            // so when we use this method we need to wrap this in try catch
            Class.forName("ThrowAndThrows");
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("The class is not found");
        }
    }
}