package chess;

import java.util.LinkedList;


public class Rook extends ChessPropreties implements RightLeftUpDownMove{
public Rook(int x, int y){
    setXAndY(x,y);
}
    @Override
    public LinkedList checkForBorders(boolean bp) {
        if (listY != null || listX != null) {
            listY.clear();
            listX.clear();
        }
        if (redlistY!=null || redlistY!=null){
            redlistY.clear();
            redlistX.clear();
        }
        if(x!=-1 && y!=-1) {
            checkLeft(bp);
            checkRight(bp);
            checkUp(bp);
            checkDown(bp);
        }
return moving();





    }

    @Override
    public void checkUp(boolean bp) {
        for (int i = y + 1; i < 8; i++) {
            if (!Chess.checkForCorrectness(x,i)) {
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
            if (!Chess.checkForCorrectness(x,i)) {
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
            if (!Chess.checkForCorrectness(i,y)) {
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
            if (!Chess.checkForCorrectness(i,y)) {
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
