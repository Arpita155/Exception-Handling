package ExceptionHandling.Throws;

import java.io.CharConversionException;

public class Ex1 {
    static void fun1() throws CharConversionException {
        try {
            throw new CharConversionException("ja dite chao dao.");
        } finally {
            System.out.println("YO!");
        }
    }

    public static void main(String[] args) {
        try {
            fun1();
        } catch(NullPointerException | CharConversionException f) {
            System.out.println(f);
            System.out.println(f.getMessage());
        }
    }

    //------------- OUTPUT---------------:
    // YO!
    // java.io.CharConversionException: ja dite chao dao.
    // ja dite chao dao.
}
