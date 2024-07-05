package chess.board;

import chess.pieces.IPiece;
import chess.core.Position;

public class BoardPrinter {
    private IBoard board;

    public BoardPrinter(IBoard board) {
        this.board = board;
    }

    public void printBoard() {
        System.out.println("  a b c d e f g h");
        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + " ");
            for (int j = 0; j < 8; j++) {
                IPiece piece = board.getBoard().get(new Position(i, j));
                if (piece == null) {
                    System.out.print(". ");
                } else {
                    System.out.print(piece.getSymbol() + " ");
                }
            }
            System.out.println(8 - i);
        }
        System.out.println("  a b c d e f g h");
    }
}
