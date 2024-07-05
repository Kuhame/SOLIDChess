package chess.pieces;

import chess.core.IPosition;
import java.util.Map;

public abstract class Piece implements IPiece {
    private boolean white;

    public Piece(boolean white) {
        this.white = white;
    }

    @Override
    public boolean isWhite() {
        return white;
    }

    @Override
    public abstract boolean isValidMove(IPosition from, IPosition to, Map<IPosition, IPiece> board);

    @Override
    public abstract char getSymbol();
}
