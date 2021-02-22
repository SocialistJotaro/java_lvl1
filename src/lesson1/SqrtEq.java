package lesson1;

import java.util.Scanner;

public class SqrtEq {
    public static void main(String[] args) {
        System.out.println("Enter args a, b, c");
        Scanner in =  new Scanner(System.in);
        double a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        double D =  b*b - 4 * a * c;
        if(D < 0){
            System.out.println("No solutions");
        } else if (D == 0){
            System.out.println("Only root x = " + (-b / (2*a)));
        } else {
            System.out.println("Two roots");
            double x1 = (-b - Math.sqrt(D) /  (2 *  a));
            double x2 = (-b + Math.sqrt(D) /  (2 *  a));
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
    }
}
