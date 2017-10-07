package chess;
import sun.management.LazyCompositeData;

import java.util.LinkedList;
import java.util.zip.ZipEntry;

public abstract class ChessPropreties{

    protected int x;
    protected int y;
    protected LinkedList<LinkedList<Integer>> listForSteps= new LinkedList<>();
    protected LinkedList<Integer> listX = new LinkedList<>();
    protected LinkedList<Integer> listY = new LinkedList<>();
    protected LinkedList<Integer> redlistX = new LinkedList<>();
    protected LinkedList<Integer> redlistY = new LinkedList<>();


    public abstract LinkedList checkForBorders(boolean bp);

    protected LinkedList moving() {

        listForSteps.add(listX);
        listForSteps.add(listY);
        listForSteps.add(redlistX);
        listForSteps.add(redlistY);

        return listForSteps;
    }



    public void setXAndY(int x , int y) {
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }




protected void checkingForOponnets(int x, int y, boolean yourFigure){
    if(Chess.checkForAttack(x,y,yourFigure) ){
        redlistX.add(x);
        redlistY.add(y);

    if(Chess.getWhiteking().getX()==x && Chess.getWhiteking().getY()==y){
   Chess.setWhiteKingIsUnderAttack(true);

}
        if(Chess.getKing().getX()==x && Chess.getKing().getY()==y){
       
            Chess.setBlackKingIsunderAttack(true);
        }
    }

}


}
