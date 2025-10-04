package ReadingInput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Enter the number through buffered reader ");
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            int num = Integer.parseInt(br.readLine());
            System.out.println("Input number read from BufferedReader " + num);
            br.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Exception thrown in main method");
        }
    }
}
