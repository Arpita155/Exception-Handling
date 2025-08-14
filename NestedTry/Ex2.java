package ExceptionHandling.NestedTry;

public class Ex2 {
    public static void main(String[] args) {

        try {
            int a = args.length;  // If no args it will generate exception
            int b = 46/a;
            System.out.println("a = "+a);
            try {
                if(a == 1){
                    a =a/(a-a);
                }
                if (a == 2){
                    int c[] = {1};
                    c[3] =46;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("The Exception is: "+e);
            }
        }catch (ArithmeticException e){
            System.out.println("Exception is: "+e);
        }


        // ------OUTPUT-----:
        // Exception is: java.lang.ArithmeticException: / by zero


    }  // end of main()
}  // end of class
