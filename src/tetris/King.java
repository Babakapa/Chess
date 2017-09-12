package tetris;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Асус on 14.06.2017.
 */
public class King extends ChessPropreties {
    public King(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public LinkedList moving() {
        if(listY!=null || listX!=null) {
            listY.clear();
            listX.clear();
        }
            checkForBorders();
            listForSteps.add(listX);
            listForSteps.add(listY);



return listForSteps;
    }

    @Override
    public void checkForBorders() {
        for (int i = x - 1; i < x + 2; i++)
            for (int j = y - 1; j < y + 2; j++) {

                    if (i > -1 && i < 8 && j > -1 && j < 8) {
                        listX.add(i);
                        listY.add(j);

                    }

        }
    }
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }
}


