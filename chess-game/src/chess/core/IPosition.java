package chess.core;

public interface IPosition {
    int getRow();
    int getCol();
    boolean equals(Object obj);
    int hashCode();
}
