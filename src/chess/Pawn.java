package chess;



public class Pawn extends ChessPropreties{
    private boolean firstStep = true;
public Pawn(int x, int y){
setXAndY(x,y);
}



    @Override
    public void checkForBorders() {
    if(firstStep){
        if(Board.checkIcon(x,y + 1)==null && Board.checkIcon(x, y+ 2)==null) {
            listX.add(x);
            listX.add(x);
            listY.add(y + 1);
            listY.add(y + 2);
        }
    }
else{
        if(y < 7) {
            listX.add(x);
            listY.add(y + 1);
        }
    }

}

    public void setFirstStep() {
         firstStep = false;
    }
}