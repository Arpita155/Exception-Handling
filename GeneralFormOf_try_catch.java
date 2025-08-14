package ExceptionHandling;

public class GeneralFormOf_try_catch {
    public static void main(String[] args) {

        try {
            // block of code for monitoring errors
        }catch (ArithmeticException e){
            // exception handler for Arithmetic Exception
        }catch (ArrayIndexOutOfBoundsException e){
            // exception handler for ArrayIndexOutOfBoundsException
        }
        finally{
            // block of code to be executed
            // after try block ends
        }
    }
}
