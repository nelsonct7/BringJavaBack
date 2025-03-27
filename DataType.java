public class DataType {
    int num1 = 1234568; // 2^31-1 this is the maximum value of int
    byte num2 = 127; // 2^7-1 this is the maximum value of byte
    short num3 = 32767; // 2^15-1 this is the maximum value of short
    long num4 = 9223372036854775807L; // 2^63-1 this is the maximum value of long
    // float num7=9999.369; // by default float is double so we need to add f at the
    // end of the number
    float num5 = 3.4e+38f; // 3.4e+38f this is the maximum value of float
    double num6 = 1.7e+308; // 1.7e+308 this is the maximum value of double
    char letter = 'A'; // A this is the maximum value of char, and always use single quotes, never use double quotes
    boolean flag = true; // true this is the maximum value of boolean

    public static void main(String args[]) {
        DataType dtObj = new DataType();
        System.out.println("Integer value is : " + dtObj.num1 + " this of the size of int is 4 bytes");
        System.out.println("Byte value is : " + dtObj.num2 + " this of the size of byte is 1 byte");
        System.out.println("Short value is : " + dtObj.num3 + " this of the size of short is 2 bytes");
        System.out.println("Long value is : " + dtObj.num4 + " this of the size of long is 8 bytes");
        System.out.println("Float value is  : " + dtObj.num5 + " this of the size of float is 4 bytes");
        System.out.println("Double value is : " + dtObj.num6 + " this of the size of double is 8 bytes");
        System.out.println("Character value is : " + dtObj.letter + " this of the size of char is 2 bytes");
        System.out.println("Boolean value is : " + dtObj.flag + " this of the size of boolean is 1 bit");
    }
}