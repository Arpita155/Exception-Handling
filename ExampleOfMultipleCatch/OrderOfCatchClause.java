package ExceptionHandling.ExampleOfMultipleCatch;

public class OrderOfCatchClause {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b= 46/a;
        }catch (Exception e){
            System.out.println("Generic exception catch");
        }
//        catch (ArithmeticException e){               // It gives error
//            System.out.println("Unreachable");
//        }

        // ----Explanation of the error---:
        // We get error msg second catch statement is unreachable  i.e. because exception has already been caught.
        // SOLUTION: To fix this , reverse the sequence of catch blocks
    }
}
