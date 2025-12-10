public class WrapperClass {
    /*
     * in java every data type has a wrapper class
     * int => Integer
     * char => Character
     * double => Double
     */
    public static void main(String[] args) {
        // other wrapper classes are Double,Char,..etc
        int num = 7;
        Integer num1 = new Integer(num); // deprecated constructor method => BOXING : primitive data type is converted
                                         // to wrapper class
        int unNum=num1.intValue(); // this is called UNBOXING getting primitive value from a wrapper class object;
        System.out.println("Interger is " + num1);

        int num2 = 8;
        Integer num3=num2; // this is AUTO-BOXING
        int unNum1=num3; // this is called AUTO-UN-BOXING
    }
}
