package chess.game;

import chess.board.IBoardSetup;
import chess.board.BoardSetup;
import chess.board.IBoard;
import chess.core.PlayerColor;
import chess.player.IPlayer;
import chess.player.Player;

import java.util.Scanner;

public class GameInitializer implements IGameInitializer{
    private IBoardSetup boardSetup;
    private Scanner scanner;

    public GameInitializer(IBoard board) {
        this.boardSetup = new BoardSetup(board);
        this.scanner = new Scanner(System.in);
    }

    public IPlayer[] initializeGame() {
        System.out.println("Enter name for Player 1:");
        String name1 = scanner.nextLine();
        System.out.println("Enter name for Player 2:");
        String name2 = scanner.nextLine();

        IPlayer player1;
        IPlayer player2;

        System.out.println(name1 + ", choose your side (white/black):");
        String side = scanner.nextLine().toLowerCase();
        if (side.equals("white")) {
            player1 = new Player(name1, PlayerColor.WHITE);
            player2 = new Player(name2, PlayerColor.BLACK);
        } else {
            player1 = new Player(name1, PlayerColor.BLACK);
            player2 = new Player(name2, PlayerColor.WHITE);
        }

        boardSetup.setupBoard();
        return new IPlayer[]{player1, player2};
    }
}
