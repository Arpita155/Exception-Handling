package ExceptionHandling.Throw.Ex2;

public class DemoThrow {

    static void demo(){
        try {
            throw new NullPointerException("hi this is an nullPointerException");
        }catch (NullPointerException e){
            System.out.println("Caught in demo");
            throw e;
        }
    }

    public static void main(String [] args){
        try {
            demo();
        }catch (NullPointerException e){
            System.out.println("Recaught: "+e);
        }
    }

    // OUTPUT:
    // Caught in demo
    //Recaught: java.lang.NullPointerException: hi this is an nullPointerException
}
