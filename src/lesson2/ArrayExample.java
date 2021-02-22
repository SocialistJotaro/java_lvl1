package lesson2;

import static java.lang.Math.max;
import static java.lang.Math.random;

public class ArrayExample {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = "Mike";
        s =  s + " " + s1;
        System.out.println(s);

        int[] a = new int[10];
        // a.length
        //(int) random() * 100;
        for (int i = 0; i < 10; i++) {
            a[i] = (int) (random() * 100);
        }
        // for each
        int sum = 0;
        for (int i : a)  {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(sum);
        int maxLength = 1, length = 1;
        a = new int[] {2, 1, 2 ,1, 2, 3, 4, 5};
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i+1] > a[i]) {
                length++;
            } else {
                maxLength = max(maxLength, length);
                length = 1;
            }
        }
        System.out.println(max(maxLength, length));
    }
}
