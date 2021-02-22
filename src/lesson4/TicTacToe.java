package lesson4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TicTacToe {

    private static final char X = 'x';
    private static final char O = '0';
    private static final char DEFAULT = '_';
    private static final char DELIMITER = '|';

    private static final char[][] MAP = new char[3][3];


    // |X|_|_|
    // |_|0|_|
    // |_|_|X|

    private static void fillMap(){
        for (int i = 0; i < MAP.length ; i++) {
            for (int j = 0; j < MAP.length; j++) {
                MAP[i][j] = DEFAULT;
            }
        }
    }

    private static void printMap(){
        for (int i = 0; i < MAP.length; i++) {
            for (int j = 0; j < MAP.length; j++) {
                System.out.print(DELIMITER + "" +MAP[i][j]);
            }
            System.out.println(DELIMITER);
        }
    }

    private static void game() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Your move: ");
            int x = in.nextInt(), y = in.nextInt();
            x--;
            y--;
            if (validInput(x, y)) {
                MAP[x][y] = X;
                if (isWin(X)) {
                    System.out.println("You won!");
                    return;
                }
                movePC();
                if (isWin(O)) {
                    System.out.println("You Lose!");
                    return;
                }
                // TODO: 18.02.2021 Account for draw
            }
            printMap();

        }
    }

    private static void movePC() {
        // TODO: 18.02.2021 Random AI moves
        for (int i = 0; i < MAP.length; i++) {
            for (int j = 0; j < MAP.length; j++) {
                if (validInput(i, j)) {
                    MAP[i][j] = 0;
                }
            }
        }
    }

    // TODO: 18.02.2021 Optimise
    private static boolean isWin(char x) {
        if (MAP[0][0] == MAP[1][1] && MAP[1][1] == MAP[2][2] && MAP[2][2] == x) {
            return true;
        }
        return false;
    }

    private static boolean validInput(int x, int y) {
        boolean inMap = x>=0 && y >= 0 && x < MAP.length && y < MAP.length;
        return inMap && MAP[x][y] == DEFAULT;
    }

    public static void main(String[] args) {
        System.out.println("You are playing Tic-Tac-Toe");
        System.out.println("Enter 2 numbers every turn: row number and column number");
        fillMap();
        printMap();
        game();

    }
}
