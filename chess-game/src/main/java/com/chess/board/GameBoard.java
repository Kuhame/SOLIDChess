package main.java.com.chess.board;

public class GameBoard {
    private int boardId;
    private Cell[][] board;

    public GameBoard(int boardId, Cell[][] board) {
        this.boardId = boardId;
        this.board = board;
    }

    public int getBoardId() {
        return boardId;
    }

    public Cell[][] getBoard() {
        return board;
    }

    public void setBoard(Cell[][] board) {
        this.board = board;
    }
}
