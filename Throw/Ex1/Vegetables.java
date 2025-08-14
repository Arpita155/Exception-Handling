package ExceptionHandling.Throw.Ex1;

import java.io.CharConversionException;
import java.util.InputMismatchException;

public class Vegetables {
    static void fun1() {
        try {
            throw new CharConversionException("khide legeche.");
        } catch(NullPointerException | CharConversionException | InputMismatchException e) {
            System.out.println("The exception is: "+e.toString());
            System.out.println("catch block of fun1()");
        }
    }
    public static void main(String[] args) {
        fun1();
        try {
            throw new CucumberIsAVegetable("tui jantish na?");
        } catch(CucumberIsAVegetable e) {
            System.out.println("Exception is: "+e);
            System.out.println("massage of the exception is: "+e.getMessage());
        }
    }
}
