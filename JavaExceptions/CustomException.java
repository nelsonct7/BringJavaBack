package JavaExceptions;

class DemoException extends Exception {
    public DemoException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String args[]) {
        try {
            System.out.println("Throwing custom exception");
            throw new DemoException("This is the error message thrown with custom exception");
        } 
        catch(DemoException de){
            System.err.println("This error is shown from the try block for custom exception "+de);
        }        
        catch (Exception e) {
            System.err.println("The upper level exception is handled here "+e);
        }
    }
}
