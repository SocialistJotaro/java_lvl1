package lesson4;

import java.util.Scanner;

public class hwfav {

    private static final String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
            "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    public static void wordGame(){
        int count = words.length;
        int randomIdx = (int) (Math.random()*count);
        String target = words[randomIdx];
        System.out.println("Welcome to 'Guess that word!'");
        System.out.println("You will need to guess one of " + count + "words.");
        System.out.println("Today's theme is fruits and vegetables.");
        Scanner in = new Scanner(System.in);
        char[] guess = new char[15];
        for (int i = 0; i < 15; i++) {
            guess[i] =  '#';
        }
        while (true) {
            System.out.println("Enter your guess:");
            String word = in.next();
            if (word.equals(target)) {
                System.out.println("You Won! The word was " + target);
                System.out.println("Game over");
                return;
            }

            boolean anyEquals = false;
            int minLength = Math.min(word.length(), target.length());
            for (int i = 0; i < minLength; i++) {
                if (word.charAt(i) == target.charAt(i)){
                    if (guess[i] == '#') {
                        anyEquals = true;
                    }
                    guess[i] = word.charAt(i);
                    anyEquals = true;
                }
            }
            if (anyEquals) {
                System.out.println("You guessed some letters");
            }
            for (int i = 0; i < 15; i++) {
                System.out.print(guess[i]);
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        wordGame();
    }
}
