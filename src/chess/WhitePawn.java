package chess;

import java.util.LinkedList;

/**
 * Created by Асус on 17.09.2017.
 */
public class WhitePawn extends ChessPropreties {

    public WhitePawn(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void setXAndY(int x, int y){
        this.x = x;
        this.y = y;
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
            if (pawnFirstStep) {
                if (!Chess.checkForCorrectness(x,y-1)) {

                    listX.add(x);
                    listY.add(y - 1);

                    if (!Chess.checkForCorrectness(x,y-2)) {
                        listX.add(x);
                        listY.add(y - 2);
                    }
                }
            } else {
                if (y > 0) {
                    listX.add(x);
                    listY.add(y - 1);
                }
            }
            if (x + 1 < 8 && y - 1 > -1 && Board.checkIcon(x + 1, y - 1) != null)
                checkingForOponnets(x + 1, y - 1, bp);
            if (x - 1 > -1 && y - 1 > -1 && Board.checkIcon(x - 1, y - 1) != null)
                checkingForOponnets(x - 1, y - 1, bp);
        }
return moving();
    }


}
