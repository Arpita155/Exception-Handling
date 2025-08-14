package ExceptionHandling.ExampleOfMultipleCatch;

public class Ex2 {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = "+a);
            int b = 46/a;
            int c[] = {1};
            c[46] = 81;
        }catch (ArithmeticException e){
            System.out.println("The Exception is: "+e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception is: "+e);
        }
        System.out.println("After try catch.");
    }


    // -------------OUTPUT-------------:
    //a = 0
    //The Exception is: java.lang.ArithmeticException: / by zero
    //After try catch.
}
