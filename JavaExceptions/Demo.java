package JavaExceptions;

/*
 * There are different types of errors in Java
 * 1. Compile time errors
 * this type of errors are detected by compiler in compile time, like syntactical errors
 * 2. Runtime Errors
 * the execution stops if this kind of error is raised, normally these are called exceptions
 * the statements can be normal and critical depending on the situation the statement is written.
 * arithmetic exception.
 * 3. Logical Errors
 * this type of errors are raised in the logic programmer implement in the code
 */

public class Demo {
    public static void main(String[] args) {
        // arithmetic exception
        int i = 5;
        int j = 0;
        int a[] = new int[5];
        // try block will be executed for sure
        try {
            j = 10 / i;
            System.out.println("First element is " + a[0]);
            System.out.println("The tenth element in array is " + a[10]);
            // catch block works if only an exceptions is thrown
        } catch (ArrayIndexOutOfBoundsException aiob) {
            System.err.println("Array index breached " + aiob);
        } catch (ArithmeticException ae) {
            System.err.println("Arithmetic exception thrown " + ae);
        } catch (Exception e) {
            // Exception is the parent class of all the exceptions. which is a sub class of Throwable
            // the parent exception should be placed at the bottom, only then it can work
            System.err.println("Something went wrong " + e);
        }
        System.out.println("Output is " + j);
    }
}

/*                                         Do not apply pretty print
 *                                                        Object
 *                                                           |
 *                                                           |
 *                                                        Throwable
 *                                                           |
 *                                                           |
 *                                     -----------------------------------------------
 *                                     |                                             |
 *                                     |                                             |
 *                                     |                                             |
 *                                   Error                                       Exception
 *                                     |                                             |
 *                                     |                                             |
 *                     ------------------------------                            ------------------------------------
 *                     |        |        |          |                            |                                  |
 *              Thread-Dead   VM-Error   Out-of-M/Y  I/O-Error             Runtime Exception(unchecked)        SQL Exception(checked)
 *                                                                               |
 *                                                                               -- Arithmetic
 *                                                                               -- Array out of bound
 *                                                                               -- Null pointer
 */