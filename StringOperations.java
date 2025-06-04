import java.io.*;

// strings are 

class StrActions {

    String readString(){
        try {
            BufferedReader refBr=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your string ");
            return refBr.readLine();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Failed to get string ");
        }
        return null;
    }

    String addString(String str1, String str2) {
        return str1 + " " + str2;
    }
}

public class StringOperations {
    public static void main(String args[]) {

    }
}
