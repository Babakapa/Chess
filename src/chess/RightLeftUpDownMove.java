package chess;

/**
 * Created by Асус on 17.09.2017.
 */
public interface RightLeftUpDownMove {
    void checkUp(boolean bp);
    void checkDown(boolean bp);
    void checkRight(boolean bp);
    void checkLeft(boolean bp);
}
