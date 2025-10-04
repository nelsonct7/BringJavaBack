package ReadingInput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CloseReader {
    public static void main(String[] args) {
        // once we open a connection we need to close the connection to the resource, so
        // other threads can access the resource once our user is completed
        // there are multiple way to close the connection to a resource
        // Option 1 => in the try block
        try {
            BufferedReader brRef = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the number ");
            int num = Integer.parseInt(brRef.readLine());
            System.out.println("Printing the out put " + num);
            brRef.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Exception thrown from main Option1 ");
        }

        // Option 2 => using finally block
        BufferedReader brRef2 = null;
        try {
            brRef2 = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the number ");
            int num2 = Integer.parseInt(brRef2.readLine());
            System.out.println("Number from second option " + num2);
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Exception thrown from main Option2");
        } finally {
            if (brRef2 != null) {
                try {
                    brRef2.close();
                } catch (Exception e) {
                    System.err.println("Exception thrown while closing brRef2");
                }
            }
        }

        // Option 3
        try (BufferedReader brRef3 = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the number ");
            int num4 = Integer.parseInt(brRef3.readLine());
            System.out.println("Number entered is " + num4);
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Exception thrown in main from the Option3");
        }
    }
}
