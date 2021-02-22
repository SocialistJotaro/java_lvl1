package lesson2;

public class Break {
    public static void main(String[] args) {
        label:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    if (i + k > 2) break label;
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
        //code blocks
        int a = 3;
        {
            int b = 4;
            {
                int c = 5;
                System.out.println(c);
            }
            System.out.println(b);
        }
    }
}
