import java.io.*;

// strings are 

// class StrActions {

//     String readString() {
//         try {
//             BufferedReader refBr = new BufferedReader(new InputStreamReader(System.in));
//             System.out.println("Enter your string ");
//             return refBr.readLine();
//         } catch (Exception e) {
//             // TODO: handle exception
//             System.out.println("Failed to get string ");
//         }
//         return null;
//     }

//     String addString(String str1, String str2) {
//         return str1 + " " + str2;
//     }
// }

public class StringOperations {
    public static void main(String args[]) {

        String name = new String("Nelson"); // String is a derived class, with lots of string operations defined as
                                            // class functions.
        String name2 = "Nelson"; // this will automatically creates the new String object.
        System.out.println("Name is " + name);

        // Note : java uses string constant pool in Heap memory of jvm to store the
        // string values
        // when you assigns or changes the value of a variable, jvm creates new value in
        // the pool,
        // and changes the memory reference of the variable to new values memory
        // reference, in below
        // hello will have a memory value called #10015 the concatenated string will
        // have a memory value of #10566 kind of value
        // java replaces var1 => memory to new value, and the old value will be garbage
        // collected and memory will be freed.
        String var1 = "hello"; // this is will create
        var1 = var1 + "Nelson";
        System.out.println("Concatenated string " + var1);

        // NOTE : inside jvm heap memory we have one place called string constant pool.
        // when we declare same value to different variables in string,
        // both objects will point to the address of the value stored in pool
        String strObj1 = "ObjcectRef";
        String strObj2 = "ObjcectRef";
        System.out.println("is strings are equal " + strObj1 == strObj2);

        // Mutable string, immutable string
        // by default strings are immutable and not able to change the value
        // to implement a mutable string we have StringBuffer and StringBuilder classes
        // they both are mostly similar
        // string buffer has 16bit of default memory size if we increase the string size
        // it will be increased as per the requirements
        StringBuffer refObj = new StringBuffer();
        // buffer size
        System.out.println("String buffer capacity " + refObj.capacity());

        StringBuffer refObj2 = new StringBuffer("Variable value");
        System.out.println("Variable length " + refObj2.length());

        // string buffer has a lot of methods
        StringBuffer refObj3 = new StringBuffer("String Buffer");
        refObj3.append(strObj2); // concatenate
        System.out.println("Concatenated string buffer " + refObj3);
        // we cannot assign string buffer directly to string object we need to convert
        // ysing .toString
        String refStr1 = refObj3.toString();
        System.out.println("Converted from string buffer to string " + refStr1);

        // if you set a limit using setLength then the data over the limit will be set
        // to null
        StringBuffer refObj4 = new StringBuffer();
        refObj4.setLength(50);
        refObj4.append("LImited data");
        System.out.println("String buffer extended " + refObj4);

        // difference between string buffer and string builder is
        // string buffer is thread safe, string reader is not
    }
}
