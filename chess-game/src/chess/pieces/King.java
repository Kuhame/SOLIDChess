package chess.pieces;

import chess.core.IPosition;
import chess.core.Position;
import java.util.Map;

public class King extends Piece {
    public King(boolean white) {
        super(white);
    }

    @Override
    public boolean isValidMove(IPosition from, IPosition to, Map<IPosition, IPiece> board) {
        int rowDiff = Math.abs(from.getRow() - to.getRow());
        int colDiff = Math.abs(from.getCol() - to.getCol());
        return rowDiff <= 1 && colDiff <= 1;
    }

    @Override
    public char getSymbol() {
        return isWhite() ? 'K' : 'k';
    }
}
