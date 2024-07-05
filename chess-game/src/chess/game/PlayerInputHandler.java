package chess.game;

import chess.board.IBoard;
import chess.core.IPosition;
import chess.core.Position;
import java.util.Scanner;

public class PlayerInputHandler {
    private Scanner scanner;
    private IBoard board;

    public PlayerInputHandler(IBoard board) {
        this.board = board;
        this.scanner = new Scanner(System.in);
    }

    public boolean handleInput(boolean whiteTurn) {
        System.out.println("Enter move (e.g., e2 e4):");
        String move = scanner.nextLine();
        String[] parts = move.split(" ");
        if (parts.length != 2) {
            System.out.println("Invalid move format.");
            return false;
        }

        IPosition from = new Position(parts[0]);
        IPosition to = new Position(parts[1]);

        return board.movePiece(from, to, whiteTurn);
    }
}
