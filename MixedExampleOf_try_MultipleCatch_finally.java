package ExceptionHandling;

import java.util.InputMismatchException;

public class MixedExampleOf_try_MultipleCatch_finally {

    static void f1(int[] a) {
        System.out.println("Hello, this is f1() function.");
        System.out.println("I am calling it from the main().");
        try {
            f2();
        } catch(NullPointerException e) {
            System.out.println("Ami khali nullpointer exception k handle korchi.");
        } catch(Exception e) {
            System.out.println("F1() mein hi handle ho jayega.");
            System.out.println("The Exception is: "+e);
            return;
        }
        finally {
            System.out.println("Mai ke laal, apun abhi zinda hai.!!!!");
        }
        a[2] = 5;
        System.out.println("After calling f2() from f1(). This line won't be executed.");
    }

    static void f2() {
        int a = 10;
        int b = 0;
        System.out.println("I am in f2() function. Jhamela badbe.");
        try {
            System.out.println(a/b);        // Arithmetic exception - / by 0.
        } finally {
            System.out.println("Ekhane arithmetic exception handle hobe na. Eita finally block in f2()");
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,6};
        System.out.println("This is main()");
        try {
            f1(a);
        } catch(Exception e) {
            System.out.println("Shob handle hoye jabe.");
        }
        System.out.println("After calling f1().");
        for(int i: a) {
            System.out.print(i + " ");
        }
    }


    // -------------------OUTPUT----------------:

    // This is main()
    //Hello, this is f1() function.
    //I am calling it from the main().
    //I am in f2() function. Jhamela badbe.
    //Ekhane arithmetic exception handle hobe na. Eita finally block in f2()
    //F1() mein hi handle ho jayega.
    //The Exception is: java.lang.ArithmeticException: / by zero
    //Mai ke laal, apun abhi zinda hai.!!!!
    //After calling f1().
    //1 2 3 4 6
}
