package main.java.com.chess.board;

import main.java.com.chess.pieces.Piece;

public class GameBoard {
    private Piece[][] board;

    public GameBoard() {
        board = new Piece[8][8];
    }

    public void addPiece(Piece piece) {
        board[piece.getX()][piece.getY()] = piece;
    }

    public void movePiece(Piece piece, int x, int y) {
        board[piece.getX()][piece.getY()] = null;
        piece.setX(x);
        piece.setY(y);
        board[x][y] = piece;
    }

    public Piece getPiece(int x, int y) {
        return board[x][y];
    }
}
