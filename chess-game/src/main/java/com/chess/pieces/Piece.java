package main.java.com.chess.pieces;

import main.java.com.chess.board.Position;

public abstract class Piece {
    private Position position;
    private boolean isWhite;

    public Piece(int x, int y, boolean isWhite) {
        this.position = new Position(x, y);
        this.isWhite = isWhite;
    }

    public abstract boolean canMove(int x, int y);

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    public int getX() {
        return position.getX();
    }

    public void setX(int x) {
        position.setX(x);
    }

    public int getY() {
        return position.getY();
    }

    public void setY(int y) {
        position.setY(y);
    }
}
