package main.java.com.chess.pieces;

public class King extends Piece {
    public King(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
    }

    @Override
    public boolean canMove(int x, int y) {
        // The king can move one square in any direction
        if ((x == getX() + 1 && y == getY()) ||
            (x == getX() - 1 && y == getY()) ||
            (x == getX() && y == getY() + 1) ||
            (x == getX() && y == getY() - 1) ||
            (x == getX() + 1 && y == getY() + 1) ||
            (x == getX() + 1 && y == getY() - 1) ||
            (x == getX() - 1 && y == getY() + 1) ||
            (x == getX() - 1 && y == getY() - 1)) {
            return true;
        }
        return false;
    }
}
