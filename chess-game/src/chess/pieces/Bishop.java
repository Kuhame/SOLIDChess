package chess.pieces;

import chess.core.IPosition;
import chess.core.Position;
import java.util.Map;

public class Bishop extends Piece {
    public Bishop(boolean white) {
        super(white);
    }

    @Override
    public boolean isValidMove(IPosition from, IPosition to, Map<IPosition, IPiece> board) {
        if (Math.abs(from.getRow() - to.getRow()) != Math.abs(from.getCol() - to.getCol())) {
            return false;
        }

        int rowStep = from.getRow() < to.getRow() ? 1 : -1;
        int colStep = from.getCol() < to.getCol() ? 1 : -1;
        for (int row = from.getRow() + rowStep, col = from.getCol() + colStep; row != to.getRow(); row += rowStep, col += colStep) {
            if (board.get(new Position(row, col)) != null) {
                return false;
            }
        }

        return true;
    }

    @Override
    public char getSymbol() {
        return isWhite() ? 'B' : 'b';
    }
}
