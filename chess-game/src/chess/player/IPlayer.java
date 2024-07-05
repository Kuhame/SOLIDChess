package chess.player;

import chess.core.PlayerColor;

public interface IPlayer {
    String getName();
    PlayerColor getColor();
    void setColor(PlayerColor color);

    void setName(String s);
}
