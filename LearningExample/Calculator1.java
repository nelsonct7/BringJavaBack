import java.io.*;

class InnerCalculator1 {
    public int addNumbers(int arg[]) {
        int result = 0;
        for (int i = 0; i < arg.length; i++) {
            result += arg[i];
        }
        return result;
    }
}

public class Calculator1 {
    public static void main(String args[]) {
        try {
            BufferedReader refBr = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the number of elements in the array");
            int limit = Integer.parseInt(refBr.readLine());
            int arguments[] = new int[limit];
            System.out.println("Enter the elements of the array");
            for (int i = 0; i < limit; i++) {
                arguments[i] = Integer.parseInt(refBr.readLine());
            }
            InnerCalculator1 refCalObj=new InnerCalculator1();
            int result = refCalObj.addNumbers(arguments);
            System.out.println("The sum of the elements in the array is " + result);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception in main method " + e);
        }

    }
}
