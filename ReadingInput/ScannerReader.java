package ReadingInput;

import java.util.Scanner;

public class ScannerReader {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println("Value read from scanner is " + num);
            sc.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Exception thrown in main ");
        }
    }
}
