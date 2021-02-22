package lesson2;

import java.util.Arrays;

public class hw2 {
    public static void main(String[] args) {
        // #1
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 1) arr1[i] = 0;
            else arr1[i] = 1;
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // #2
        int[] arr2 = new int[8];
        int j = 0;
        for (int i = 0; i < 8; i++) {
            arr2[i] = j;
            j+=3;
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        // #3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] *= 2;
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

        // #4
        int[] [] table1 = new int[10][10];
        for (int i = 0; i < table1.length; i++) {
            for (int k = 0; k < table1[i].length;k++) {
                if (i==k) table1[i][k] = 1;
                else table1[i][k] = 0;
                System.out.print(table1[i][k] + "  ");
            }
            System.out.println();
        }

        // #5
        int[] arr5 = new int[20];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = (int) (Math.random() * 100);
            System.out.print(arr5[i] + " ");
        }
        int max = arr5[1];
        int min = arr5[1];
        System.out.println();
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > max) max = arr5[i];
            if (arr5[i] < min) min = arr5[i];
        }
        System.out.println(max + " " + min);

        //#6
        int[] array = {1, 1};
        System.out.println(checkBalance(array));
    }

    static boolean checkBalance(int[] array1) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
             sum1 += array1[i];
            for (int j = i+1; j < array1.length; j++) {
                sum2 += array1[j];
            }
        if (sum1 == sum2) {
            return true;
        } else sum2 = 0;
        }
        return false;
    }

}
