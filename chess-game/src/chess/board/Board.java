package chess.board;

import chess.pieces.IPiece;
import chess.core.IPosition;
import java.util.HashMap;
import java.util.Map;

public class Board implements IBoard {
    private final Map<IPosition, IPiece> board;

    public Board() {
        this.board = new HashMap<>();
    }

    @Override
    public boolean movePiece(IPosition from, IPosition to, boolean whiteTurn) {
        IPiece piece = board.get(from);
        if (piece == null || piece.isWhite() != whiteTurn || !piece.isValidMove(from, to, board)) {
            return false;
        }

        IPiece target = board.get(to);
        if (target != null && target.isWhite() == whiteTurn) {
            return false;
        }

        board.remove(from);
        board.put(to, piece);
        return true;
    }

    @Override
    public Map<IPosition, IPiece> getBoard() {
        return board;
    }

    public void setPiece(IPosition position, IPiece piece) {
        board.put(position, piece);
    }
}
