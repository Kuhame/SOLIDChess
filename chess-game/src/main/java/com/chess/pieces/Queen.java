package main.java.com.chess.pieces;

public class Queen extends Piece {
    public Queen(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
    }

    @Override
    public boolean canMove(int x, int y) {
        // The queen can move diagonally or in a straight line
        if (Math.abs(x - getX()) == Math.abs(y - getY()) ||
            x == getX() || y == getY()) {
            return true;
        }
        return false;
    }
}
