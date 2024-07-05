package chess.pieces;

import chess.core.IPosition;
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

    public boolean isInCheck(IPosition kingPosition, Map<IPosition, IPiece> board) {
        for (Map.Entry<IPosition, IPiece> entry : board.entrySet()) {
            IPiece piece = entry.getValue();
            if (piece.isWhite() != this.isWhite() && piece.isValidMove(entry.getKey(), kingPosition, board)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isKing() {
        return true;
    }
}
