package chess;


import java.util.LinkedList;

/**
 * Created by Асус on 14.06.2017.
 */
public class King extends ChessPropreties {
    public King(int x, int y) {
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
        for (int i = x - 1; i < x + 2; i++)
            for (int j = y - 1; j < y + 2; j++) {
if(x!=i || y!=j)
                    if (i > -1 && i < 8 && j > -1 && j < 8) {
    if( Board.checkIcon(i,j)==null) {
        listX.add(i);
        listY.add(j);
    }
    else {
        checkingForOponnets(i,j,bp);
    }
                    }

        }




return moving();

    }

}


