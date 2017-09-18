package chess;
import java.util.LinkedList;
public abstract class ChessPropreties  {

    protected int x;
    protected int y;
    protected LinkedList<LinkedList<Integer>> listForSteps= new LinkedList<>();
    protected LinkedList<Integer> listX = new LinkedList<>();
    protected LinkedList<Integer> listY = new LinkedList<>();
    protected LinkedList<Integer> redlistX = new LinkedList<>();
    protected LinkedList<Integer> redlistY = new LinkedList<>();


    public abstract void checkForBorders(boolean bp);

    public LinkedList moving(boolean bp) {

        if (listY != null || listX != null) {
            listY.clear();
            listX.clear();
        }
        if (redlistY!=null || redlistY!=null){
            redlistY.clear();
            redlistX.clear();
        }

        checkForBorders(bp);
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
    if(ChoosingRightFigure.check(Board.checkIcon(x,y))!=yourFigure){
        redlistX.add(x);
        redlistY.add(y);

    }

}


}
