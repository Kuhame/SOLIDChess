package chess.game;

import chess.core.PlayerColor;

public interface ICheckmateValidator {
    boolean isCheckmate(PlayerColor currentPlayerColor);
}
