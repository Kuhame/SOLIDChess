package chess.pieces;

import chess.core.IPosition;
import java.util.Map;

public interface IPiece {
    boolean isWhite();
    boolean isValidMove(IPosition from, IPosition to, Map<IPosition, IPiece> board);
    char getSymbol();
}
