package chess.pieces;

import chess.core.IPosition;
import chess.core.Position;
import java.util.Map;

public class Rook extends Piece {
    public Rook(boolean white) {
        super(white);
    }

    @Override
    public boolean isValidMove(IPosition from, IPosition to, Map<IPosition, IPiece> board) {
        if (from.getRow() != to.getRow() && from.getCol() != to.getCol()) {
            return false;
        }

        if (from.getRow() == to.getRow()) {
            int colStep = from.getCol() < to.getCol() ? 1 : -1;
            for (int col = from.getCol() + colStep; col != to.getCol(); col += colStep) {
                if (board.get(new Position(from.getRow(), col)) != null) {
                    return false;
                }
            }
        } else {
            int rowStep = from.getRow() < to.getRow() ? 1 : -1;
            for (int row = from.getRow() + rowStep; row != to.getRow(); row += rowStep) {
                if (board.get(new Position(row, from.getCol())) != null) {
                    return false;
                }
            }
        }

        return true;
    }

    @Override
    public char getSymbol() {
        return isWhite() ? 'R' : 'r';
    }
}
