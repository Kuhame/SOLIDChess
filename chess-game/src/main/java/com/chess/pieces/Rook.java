package main.java.com.chess.pieces;

public class Rook extends Piece {
    public Rook(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
    }

    @Override
    public boolean canMove(int x, int y) {
        // The rook can move horizontally or vertically
        if (x == getX() || y == getY()) {
            return true;
        }
        return false;
    }
}