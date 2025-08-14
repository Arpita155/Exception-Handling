package ExceptionHandling.Throws;

public class Ex2 {
    static void throwOne() throws IllegalAccessException{
        System.out.println("Inside throwOne");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        }catch (IllegalAccessException e){
            System.out.println("Caught "+e);
        }
    }

    // -------OUTPUT------:
    // Inside throwOne
    // Caught java.lang.IllegalAccessException: demo
}
