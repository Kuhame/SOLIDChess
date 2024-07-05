package chess.player;

import chess.core.PlayerColor;

public class Player implements IPlayer {
    private String name;
    private PlayerColor color;

    public Player(String name, PlayerColor color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public PlayerColor getColor() {
        return color;
    }

    @Override
    public void setColor(PlayerColor color) {
        this.color = color;
    }

    @Override
    public void setName(String s) {
        name = s;
    }
}
