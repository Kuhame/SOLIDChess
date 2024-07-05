package chess.core;

public class Position implements IPosition {
    private int row;
    private int col;

    public Position(String pos) {
        this.col = pos.charAt(0) - 'a';
        this.row = 8 - (pos.charAt(1) - '0');
    }

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public int getCol() {
        return col;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Position position = (Position) obj;
        return row == position.row && col == position.col;
    }

    @Override
    public int hashCode() {
        return 31 * row + col;
    }
}
