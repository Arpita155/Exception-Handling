package ExceptionHandling.Finally;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {

    static void func1(int a){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        try {
            int input = obj.nextInt();
            func2(a,input);
        }catch (InputMismatchException p){
            System.out.println(p.toString());
            System.out.println("This is the catch block of func1(). It handles InputMismatchException");
        }
        finally {
            System.out.println("This is the finally block of func1()");
        }
        System.out.println("K jane eta print hobe kina, In func1() after finally.");
    }

    static void func2(int a, int b){
        try {
            System.out.println("Division of two numbers is: "+a/b);
        }finally {
            System.out.println("finally is func2()");
        }
        System.out.println("ei line ta func2() a finally block er pore ache.");
    }

    public static void main(String[] args) {
        int a=10;
        try {
            func1(a);
        }catch (Exception e){
            System.out.println("sob handle hoye jabe.");
            System.out.println("This is catch block of main() . The Exception is : "+e.toString());
        }finally {
            System.out.println("eita main() er finally block");
        }
        System.out.println("ei line ta main() a finally block er pore ache.");
    }
}
