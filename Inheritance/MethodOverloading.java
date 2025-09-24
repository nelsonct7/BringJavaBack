package Inheritance;

class Calc {
    public int add(int a, int b) {
        return a + b;
    }

    public String add(String a, String b) {
        String c = a.concat(b);
        return c;
    }

    public int add(int a) {
        int val = 10;
        return a + val;
    }
}

class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(
                "This is not a part of inheritance , but this should be raising with the method overriding in inheritance thats why this is added here.");
        Calc calcObj = new Calc();
        int sum = calcObj.add(5, 60);
        System.out.println("Value after adding two number passing in add function " + sum);
        String sum1 = calcObj.add("Nelson ", "Chittilappilly");
        System.out.println("String value concatenated using add function by passing tow string value " + sum1);
        int sum2 = calcObj.add(10);
        System.out.println("Value after adding one number with a constant value in the add function is " + sum2);
    }
}
