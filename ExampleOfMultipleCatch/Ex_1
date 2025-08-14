package ExceptionHandling.ExampleOfMultipleCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_1 {
    float a;

    public static void main(String[] args) {
        Ex_1 obj = new Ex_1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a:");
        try {
            obj.a = sc.nextFloat();
            throw new NumberFormatException("Hello, this is Arpita.");
            // System.out.println("Division is " + obj.a / 0);
        }catch (InputMismatchException misti){
            System.out.println(misti.getMessage());
            System.out.println("Exception er nam holo: "+misti);
        }catch (NumberFormatException flower){
            System.out.println("NumberFormatException er massage holo: "+flower);
        }catch (Exception e){
            System.out.println("Exception is: "+e.getMessage());
            System.out.println("Exception er nam holo "+e);
        }
        System.out.println("Yeah, i took input from user. So much hardwork!!");
        System.out.println("value of a is " + obj.a);
    }
}
