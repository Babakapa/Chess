package chess;




import java.util.LinkedList;


/**
 * Created by Асус on 11.09.2017.
 */
public abstract class ChessPropreties  {

    protected int x;
    protected int y;
    protected LinkedList<LinkedList<Integer>> listForSteps= new LinkedList<>();
    protected LinkedList<Integer> listX = new LinkedList<>();
    protected LinkedList<Integer> listY = new LinkedList<>();
    public abstract LinkedList moving();
    public abstract void checkForBorders();
}
