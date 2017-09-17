package chess;

/**
 * Created by Асус on 17.09.2017.
 */
public class WhitePawn extends ChessPropreties {
    private boolean firstStep = true;
    public WhitePawn(int x, int y){
        setXAndY(x,y);
    }



    @Override
    public void checkForBorders() {
        if(firstStep){
            if(Board.checkIcon(x,y - 1)==null) {

                listX.add(x);
                listY.add(y - 1);

                if(Board.checkIcon(x,y - 2)==null){
                    listX.add(x);
                    listY.add(y - 2);
                }
            }
        }
        else{
            if(y > -1) {
                listX.add(x);
                listY.add(y - 1);
            }
        }

    }

    public void setFirstStep() {
        firstStep = false;
    }

}
