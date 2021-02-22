package lesson1;

public class HelloWorld {
    // psvm
    public static void main(String[] args){
        // sout
        System.out.println("Hello World");
        // Типы данных
        byte byteVar = -128;
        short shortVar =  -32768;
        int intVar = (int) 2e9;
        long longVar = (long) 1e18;

        float floatVar = 123.44554f;
        double doubleVar = 1.5;

        char symbol = '*';

        boolean boolVar = true;

//      8 типов данных

        long a = 12 + (byte) 34L;
        int b = 12 + (byte) 34L;

        System.out.println(1/3d);
        System.out.println(1/3f);
//        System.out.printf("%.20f\n%.20f", 1/3d, 1/3f);

        int c = (byte) 128;
        System.out.println(c);

// до 120 символов в одной строке
        int x = 100, y = 10;
        System.out.println("------------------------------------------");
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
        System.out.println(x%y);
        System.out.println((double) x / y);

        // побитовые операции
        x = x << 1;
        x = x >> 2;
        x = x | y;


    }
}
