package chess;


import java.util.LinkedList;

public class Pawn extends ChessPropreties{

public Pawn(int x, int y){
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
            if (firstStep) {
                if (Board.checkIcon(x, y + 1) == null&& !Chess.checkForCorrectness(x,y+1)) {

                    listX.add(x);
                    listY.add(y + 1);

                    if (Board.checkIcon(x, y + 2) == null&& !Chess.checkForCorrectness(x,y+2)) {
                        listX.add(x);
                        listY.add(y + 2);
                    }
                }
            } else {
                if (y < 7) {
                    listX.add(x);
                    listY.add(y + 1);
                }
            }
            if (x + 1 < 8 && y + 1 < 8 && Board.checkIcon(x + 1, y + 1) != null)
                checkingForOponnets(x + 1, y + 1, bp);
            if (x - 1 > -1 && y + 1 < 8 && Board.checkIcon(x - 1, y + 1) != null)
                checkingForOponnets(x - 1, y + 1, bp);
        }
return moving();
}





}