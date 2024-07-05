package chess.board;

import chess.pieces.IPiece;
import chess.core.IPosition;
import java.util.Map;

public interface IBoard {
    boolean movePiece(IPosition from, IPosition to, boolean whiteTurn);
    Map<IPosition, IPiece> getBoard();
    void setPiece(IPosition position, IPiece piece);
}
