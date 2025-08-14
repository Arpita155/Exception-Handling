package ExceptionHandling.Finally;

public class Ex2 {
    static void pA(){
        try {
            System.out.println("In A");
            throw new RuntimeException("demoA");
        }finally {
            System.out.println("A finally");
        }
    }

    static void pB(){
        try {
            System.out.println("In B");
            return;
        }finally {
            System.out.println("B finally");
        }
    }

    static void pC(){
        try {
            System.out.println("In C");
        }finally {
            System.out.println("C finally");
        }
    }

    public static void main(String[] args) {

        try {
            pA();
        }catch (Exception e){
            System.out.println("Exception caught");
        }
        pB();
        pC();
    }

    // --------OUTPUT-------:
    // In A
    // A finally
    // Exception caught
    // In B
    // B finally
    // In C
    // C finally
}
