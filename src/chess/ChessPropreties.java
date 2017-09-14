package chess;
import java.util.LinkedList;
public abstract class ChessPropreties  {

    protected int x;
    protected int y;
    protected LinkedList<LinkedList<Integer>> listForSteps= new LinkedList<>();
    protected LinkedList<Integer> listX = new LinkedList<>();
    protected LinkedList<Integer> listY = new LinkedList<>();
    public abstract void checkForBorders();

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

}
