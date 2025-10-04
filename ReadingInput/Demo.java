package ReadingInput;

public class Demo {
    public static void main(String[] args) {
        try {
            System.out.println("Enter the number through System class using PrintStreamClass ");
            int num = System.in.read();
            // the system.in reads input in ASCI value, and only one value can be read at a
            // time
            // also this method throws and IOException,
            System.out.println("The System.in always returns the ASCI value of single character " + num);
        } catch (Exception e) {
            System.err.println("Exception thrown from main thread");
        }
    }
}
