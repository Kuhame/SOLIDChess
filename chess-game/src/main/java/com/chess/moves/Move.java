package main.java.com.chess.moves;

import main.java.com.chess.board.Cell;
import main.java.com.chess.pieces.Piece;

public class Move {
    private int moveId;
    private Cell destination;
    private int points;
    private Piece piece;

    public Move(int moveId, Cell destination, int points, Piece piece) {
        this.moveId = moveId;
        this.destination = destination;
        this.points = points;
        this.piece = piece;
    }

    public boolean legalMove() {
//         Todo: Implement this method
        return true;
    }

}
