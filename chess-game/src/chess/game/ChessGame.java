package chess.game;

import chess.board.Board;
import chess.board.IBoardPrinter;
import chess.board.BoardPrinter;
import chess.board.IBoard;
import chess.core.PlayerColor;
import chess.player.IPlayer;

public class ChessGame implements IChessGame {
    private IBoard board;
    private IBoardPrinter boardPrinter;
    private IGameInitializer gameInitializer;
    private IPlayerInputHandler playerInputHandler;
    private ICheckmateValidator checkmateValidator;
    private IPlayer player1;
    private IPlayer player2;

    public ChessGame() {
        this.board = new Board();
        this.boardPrinter = new BoardPrinter(board);
        this.gameInitializer = new GameInitializer(board);
        this.playerInputHandler = new PlayerInputHandler(board);
        this.checkmateValidator = new CheckmateValidator(board);
    }

    @Override
    public void start() {
        System.out.println("Welcome to Chess!");
        IPlayer[] players = gameInitializer.initializeGame();
        this.player1 = players[0];
        this.player2 = players[1];

        boolean whiteTurn = true;
        while (true) {
            boardPrinter.printBoard();

            if (checkmateValidator.isCheckmate(whiteTurn ? PlayerColor.WHITE : PlayerColor.BLACK)) {
                System.out.println("Checkmate! " + (whiteTurn ? "Black" : "White") + " wins!");
                break;
            }

            if (playerInputHandler.handleInput(whiteTurn)) {
                whiteTurn = !whiteTurn;
            } else {
                System.out.println("Invalid move.");
            }

            if (whiteTurn) {
                System.out.println(player1.getColor() == PlayerColor.WHITE ? player1.getName() + "'s move (White):" : player2.getName() + "'s move (White):");
            } else {
                System.out.println(player1.getColor() == PlayerColor.BLACK ? player1.getName() + "'s move (Black):" : player2.getName() + "'s move (Black):");
            }
        }
    }
}