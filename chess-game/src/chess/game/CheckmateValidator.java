package chess.game;

import chess.board.IBoard;
import chess.core.PlayerColor;
import chess.core.IPosition;
import chess.core.Position;
import chess.pieces.IPiece;
import chess.pieces.King;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckmateValidator {
    private IBoard board;

    public CheckmateValidator(IBoard board) {
        this.board = board;
    }

    public boolean isCheckmate(PlayerColor currentPlayerColor) {
        IPosition kingPosition = findKing(currentPlayerColor);
        IPiece kingPiece = board.getBoard().get(kingPosition);
        if (kingPiece == null || !kingPiece.isKing()) {
            System.out.println("Error: King piece is null or not a king at position: " + kingPosition);
            return false;
        }

        King king = (King) kingPiece;
        if (!king.isInCheck(kingPosition, board.getBoard())) {
            return false;  // Not in check, so not checkmate
        }

        // Generate all possible moves for the current player
        for (Map.Entry<IPosition, IPiece> entry : board.getBoard().entrySet()) {
            if (entry.getValue().isWhite() == (currentPlayerColor == PlayerColor.WHITE)) {
                IPosition from = entry.getKey();
                IPiece piece = entry.getValue();
                // Generate all possible target positions
                for (IPosition to : getAllPossiblePositions()) {
                    if (piece.isValidMove(from, to, board.getBoard())) {
                        // Simulate the move
                        Map<IPosition, IPiece> boardCopy = new HashMap<>(board.getBoard());
                        boardCopy.remove(from);
                        boardCopy.put(to, piece);

                        // Check if king is still in check after the move
                        IPiece kingCopy = boardCopy.get(kingPosition);
                        if (kingCopy != null && kingCopy.isKing() && !((King) kingCopy).isInCheck(kingPosition, boardCopy)) {
                            return false;  // Found a move that prevents check, so not checkmate
                        }
                    }
                }
            }
        }
        return true;  // No move can prevent check, so it's checkmate
    }


    private IPosition findKing(PlayerColor color) {
        for (Map.Entry<IPosition, IPiece> entry : board.getBoard().entrySet()) {
            IPiece piece = entry.getValue();
            if (piece.isKing() && piece.isWhite() == (color == PlayerColor.WHITE)) {
                return entry.getKey();
            }
        }
        throw new IllegalStateException("King not found on the board, which should never happen.");
    }

    private List<IPosition> getAllPossiblePositions() {
        List<IPosition> positions = new ArrayList<>();
        for (int row = 1; row <= 8; row++) {
            for (int col = 1; col <= 8; col++) {
                positions.add(new Position(row, col));
            }
        }
        return positions;
    }
}
