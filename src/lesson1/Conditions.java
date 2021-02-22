package lesson1;

import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x > 100) {
            System.out.println("Greater than 100");
        }else if (x > 10) {
            System.out.println("Greater than 10");

        } else if (x>0) {
            System.out.println("x is digit");
        }else if (x <  0){
            System.out.println("x is  negative");
        }
        else {
            System.out.println("Less than 10");
        }
    }
}
