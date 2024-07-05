package chess.board;

import chess.pieces.*;
import chess.core.Position;

public class BoardSetup {
    private IBoard board;

    public BoardSetup(IBoard board) {
        this.board = board;
    }

    public void setup() {
        // Initialize board with pieces
        // Pawns
        for (int i = 0; i < 8; i++) {
            board.setPiece(new Position(6, i), new Pawn(true));
            board.setPiece(new Position(1, i), new Pawn(false));
        }
        // Rooks
        board.setPiece(new Position(7, 0), new Rook(true));
        board.setPiece(new Position(7, 7), new Rook(true));
        board.setPiece(new Position(0, 0), new Rook(false));
        board.setPiece(new Position(0, 7), new Rook(false));
        // Knights
        board.setPiece(new Position(7, 1), new Knight(true));
        board.setPiece(new Position(7, 6), new Knight(true));
        board.setPiece(new Position(0, 1), new Knight(false));
        board.setPiece(new Position(0, 6), new Knight(false));
        // Bishops
        board.setPiece(new Position(7, 2), new Bishop(true));
        board.setPiece(new Position(7, 5), new Bishop(true));
        board.setPiece(new Position(0, 2), new Bishop(false));
        board.setPiece(new Position(0, 5), new Bishop(false));
        // Queens
        board.setPiece(new Position(7, 3), new Queen(true));
        board.setPiece(new Position(0, 3), new Queen(false));
        // Kings
        board.setPiece(new Position(7, 4), new King(true));
        board.setPiece(new Position(0, 4), new King(false));
    }
}
