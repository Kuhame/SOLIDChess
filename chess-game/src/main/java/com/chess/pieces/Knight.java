package main.java.com.chess.pieces;

public class Knight extends Piece {
    public Knight(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
    }

    @Override
    public boolean canMove(int x, int y) {
        // The knight can move in an L-shape
        if ((x == getX() + 2 && y == getY() + 1) ||
            (x == getX() + 2 && y == getY() - 1) ||
            (x == getX() - 2 && y == getY() + 1) ||
            (x == getX() - 2 && y == getY() - 1) ||
            (x == getX() + 1 && y == getY() + 2) ||
            (x == getX() + 1 && y == getY() - 2) ||
            (x == getX() - 1 && y == getY() + 2) ||
            (x == getX() - 1 && y == getY() - 2)) {
            return true;
        }
        return false;
    }
}
