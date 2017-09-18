package chess;

/**
 * Created by Асус on 17.09.2017.
 */
public interface DiagonalMove {
    void checkUpRight(boolean bp);
    void checkUpLeft(boolean bp);
    void checkDownRight(boolean bp);
    void checkDownLeft(boolean bp);
}
