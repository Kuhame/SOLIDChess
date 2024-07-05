package main.java.com.chess.pieces;

public class Bishop extends Piece {
    public Bishop(int x, int y, boolean isWhite) {
        super(x, y, isWhite);
    }

    @Override
    public boolean canMove(int x, int y) {
        // The bishop can move diagonally
        if (Math.abs(x - getX()) == Math.abs(y - getY())) {
            return true;
        }
        return false;
    }
}   
