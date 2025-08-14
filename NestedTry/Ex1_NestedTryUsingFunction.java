package ExceptionHandling.NestedTry;

public class Ex1_NestedTryUsingFunction {

    static void f1(int[] a){
        System.out.println("Hello, this is f1() function!");
        System.out.println("I am calling it from main().");
        try {
            f2();
        }catch (NullPointerException e){
            System.out.println("I am handling only null pointer exception");
        }
        System.out.println("After calling f2() from f1(). This line won;t be executed.");
    }

    static void f2(){
        int a = 10;
        int b = 0;
        System.out.println("i am in f2() function. jhamela badhbe ");
        System.out.println(a/b);    // Arithmetic exception / by 0 .
    }

    public static void main(String[] args) {

        int[] a = {1,2,3,4,6};
        System.out.println("This is main()");
        try {
            f1(a);
        }catch (Exception e){
            System.out.println("sob handle hoye jabe");
        }
        System.out.println("After calling f1(). This line won't be executed.");


        // --------OUTPUT--------:

        // This is main()
        //Hello, this is f1() function!
        //I am calling it from main().
        //i am in f2() function. jhamela badhbe
        //sob handle hoye jabe
        //After calling f1(). This line won't be executed.
    }
}


