package chess;

import java.util.LinkedList;

/**
 * Created by Асус on 14.06.2017.
 */
public class Queen extends ChessPropreties implements DiagonalMove, RightLeftUpDownMove {
private int i,j;

    public Queen(int x, int y){
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
        checkDownRight(bp);
        checkDownLeft(bp);
        checkUpRight(bp);
        checkUpLeft(bp);
        checkDown(bp);
checkLeft(bp);
checkRight(bp);
checkUp(bp);
return moving();
    }
    @Override
    public void checkUpRight(boolean bp) {
        j = y + 1;

        for (i = x + 1; i < 8 && j < 8; i++, j++) {
            if (Board.checkIcon(i, j) == null) {
                listX.add(i);
                listY.add(j);
            }
            else{
                checkingForOponnets(i, j, bp);
                break;
            }
        }
    }
    @Override
    public void checkUpLeft(boolean bp) {
        j = y - 1;
        for(i = x + 1; i < 8 && j > -1 ; i++, j--) {
            if(Board.checkIcon(i,j)==null){
                listX.add(i);
                listY.add(j);
            }
            else{
                checkingForOponnets(i, j, bp);
                break;
            }
        }
    }

    @Override
    public void checkDownRight(boolean bp) {
        j = y + 1;
        for(i = x - 1; i > -1 && j < 8 ; i--, j++) {
            if(Board.checkIcon(i,j)==null){
                listX.add(i);
                listY.add(j);
            }
            else{
                checkingForOponnets(i, j, bp);
                break;
            }
        }

    }

    @Override
    public void checkDownLeft(boolean bp) {
        j = y - 1;
        for(i = x - 1; i > -1 && j > -1 ; i--, j--) {
            if(Board.checkIcon(i,j)==null){
                listX.add(i);
                listY.add(j);
            }
            else{
                checkingForOponnets(i, j, bp);
                break;
            }
        }

    }


    @Override
    public void checkUp(boolean bp) {
        for (int i = y + 1; i < 8; i++) {
            if (Board.checkIcon(x, i) == null) {
                listX.add(x);
                listY.add(i);
            }
            else {
                checkingForOponnets(x,i,bp);
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
