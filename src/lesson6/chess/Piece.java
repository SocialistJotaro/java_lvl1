package lesson6.chess;

public abstract class Piece {

    private static final int DESK_SIZE = 8;

    private int x;
    private int y;

    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
    }
    protected boolean isInDesk(int x, int y){
        return x > 0 &&
                y > 0 &&
                x <= DESK_SIZE
                && y <= DESK_SIZE;
    }

    public void moveTo(int x, int y){
        this.x = x;
        this.y = y;
    }

    public abstract boolean canMoveTo(int x, int y);

    public static int getDeskSize() {
        return DESK_SIZE;
    }

    protected int getX() {
        return x;
    }

    protected int getY() {
        return y;
    }

}
