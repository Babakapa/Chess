package chess;

/**
 * Created by Асус on 14.06.2017.
 */
public class Rook extends ChessPropreties implements RightLeftUpDownMove{
public Rook(int x, int y){
    setXAndY(x,y);
}
    @Override
    public void checkForBorders(boolean bp) {
    checkLeft(bp);
    checkRight(bp);
    checkUp(bp);
    checkDown(bp);







    }

    @Override
    public void checkUp(boolean bp) {
        for (int i = y + 1; i < 8; i++) {
            if (Board.checkIcon(x, i) == null) {
                listX.add(x);
                listY.add(i);
            }
            else {
                checkingForOponnets(x, i, bp);
                break;
            }
        }
    }

    @Override
    public void checkDown(boolean bp) {

        for (int i = y - 1; i > -1; i--) {
            if (Board.checkIcon(x, i) == null) {
                listX.add(x);
                listY.add(i);
            }
            else {
                checkingForOponnets(x, i, bp);
                break;
            }
        }

    }

    @Override
    public void checkRight(boolean bp) {
        for (int i = x + 1; i < 8; i++) {
            if (Board.checkIcon(i, y) == null) {
                listX.add(i);
                listY.add(y);
            }
            else {
                checkingForOponnets(i, y, bp);
                break;
            }
        }
    }

    @Override
    public void checkLeft(boolean bp) {
        for (int i = x - 1; i > -1; i--) {
            if (Board.checkIcon(i, y) == null) {
                listX.add(i);
                listY.add(y);
            }
            else {
                checkingForOponnets(i, y, bp);
                break;
            }
        }

    }
}
