package chess;

import java.util.LinkedList;

public class Horse extends ChessPropreties {


public Horse(int x, int y){
    setXAndY(x,y);
}

    @Override
    public LinkedList checkForBorders(boolean bp) {
        if (listY != null || listX != null) {
            listY.clear();
            listX.clear();
        }
        if (redlistY != null || redlistY != null) {
            redlistY.clear();
            redlistX.clear();
        }
        if(x!=-1 && y!=-1) {
        if (x - 2 > -1) {
            if (y + 1 < 8) {
                if (Board.checkIcon(x - 2, y + 1) == null && !Chess.checkForCorrectness(x -2 ,y+1)) {
                    listX.add(x - 2);
                    listY.add(y + 1);
                } else checkingForOponnets(x - 2, y + 1, bp);
            }


            if (y - 1 > -1) {
                if (Board.checkIcon(x - 2, y - 1) == null && !Chess.checkForCorrectness(x-2,y-1)) {
                    listX.add(x - 2);
                    listY.add(y - 1);
                } else checkingForOponnets(x - 2, y - 1, bp);
            }
        }
        if (x + 2 < 8) {
            if (y + 1 < 8) {
                if (Board.checkIcon(x + 2, y + 1) == null&& !Chess.checkForCorrectness(x+2,y+1)) {
                    listX.add(x + 2);
                    listY.add(y + 1);
                } else checkingForOponnets(x + 2, y + 1, bp);
            }
            if (y - 1 > -1) {
                if (Board.checkIcon(x + 2, y - 1) == null&& !Chess.checkForCorrectness(x+2,y-1)) {
                    listX.add(x + 2);
                    listY.add(y - 1);
                } else checkingForOponnets(x + 2, y - 1, bp);
            }
        }
        if (y - 2 > -1) {
            if (x - 1 > -1) {
                if (Board.checkIcon(x - 1, y - 2) == null&& !Chess.checkForCorrectness(x-1,y-2)) {
                    listX.add(x - 1);
                    listY.add(y - 2);
                } else checkingForOponnets(x - 1, y - 2, bp);
            }
            if (x + 1 < 8) {
                if (Board.checkIcon(x + 1, y - 2) == null&& !Chess.checkForCorrectness(x+1,y-2)) {
                    listX.add(x + 1);
                    listY.add(y - 2);
                } else checkingForOponnets(x + 1, y - 2, bp);
            }
        }
        if (y + 2 < 8) {
            if (x - 1 > -1) {
                if (Board.checkIcon(x - 1, y + 2) == null&& !Chess.checkForCorrectness(x-1,y+2)) {
                    listX.add(x - 1);
                    listY.add(y + 2);
                } else checkingForOponnets(x - 1, y + 2, bp);
            }
            if (x + 1 < 8) {
                if (Board.checkIcon(x + 1, y + 2) == null&& !Chess.checkForCorrectness(x+1,y+2)) {
                    listX.add(x + 1);
                    listY.add(y + 2);
                } else checkingForOponnets(x + 1, y + 2, bp);
            }
        }
    }
return moving();
    }
}
