package main.java.com.chess.pieces;

public class Pawn extends Piece {
    public Pawn(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
    }

    @Override
    public boolean canMove(int x, int y) {
        // The pawn can only move one square forward
        if (x == getX() && y == getY() + 1) {
            return true;
        }
        return false;
    }
}
