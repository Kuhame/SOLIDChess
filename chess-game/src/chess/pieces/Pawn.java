package chess.pieces;

import chess.core.IPosition;
import chess.core.Position;
import java.util.Map;

public class Pawn extends Piece {
    public Pawn(boolean white) {
        super(white);
    }

    @Override
    public boolean isValidMove(IPosition from, IPosition to, Map<IPosition, IPiece> board) {
        int direction = isWhite() ? -1 : 1;
        int startRow = isWhite() ? 6 : 1;

        if (from.getCol() == to.getCol()) {
            if (to.getRow() == from.getRow() + direction && board.get(to) == null) {
                return true;
            }
            if (from.getRow() == startRow && to.getRow() == from.getRow() + 2 * direction && board.get(new Position(from.getRow() + direction, from.getCol())) == null && board.get(to) == null) {
                return true;
            }
        } else if (Math.abs(from.getCol() - to.getCol()) == 1 && to.getRow() == from.getRow() + direction && board.get(to) != null && board.get(to).isWhite() != isWhite()) {
            return true;
        }

        return false;
    }

    @Override
    public char getSymbol() {
        return isWhite() ? 'P' : 'p';
    }
}
