public class Logical {
    public static void main(String args[]){
        int x=7;
        int y=5;
        int a=5;
        int b=9;
        boolean result1=x>y && a<b;
        boolean result2=x>y || b<a;
        boolean result3=!result1;
        System.out.println("Result 1 "+result1);
        System.out.println("Result 2 "+result2);
        System.out.println("Result 3 "+result3);
    }
}   
