class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
}

public class BasicCalculator {

   public static void main(String[] args){
    Calculator obj=new Calculator();
    int result = obj.add(10,5);
    System.out.println("Result "+result);
   }
   
}

