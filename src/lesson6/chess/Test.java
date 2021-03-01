package lesson6.chess;

public class Test {
    public static void main(String[] args) {
        Piece rook = new Rook(1, 1);
        System.out.println(rook.getClass());
        System.out.println(rook.canMoveTo(2, 2));
        System.out.println(rook.canMoveTo(1, 2));
        System.out.println(rook.canMoveTo(2,1));
    }
}
