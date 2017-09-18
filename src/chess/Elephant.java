package chess;


public class Elephant extends ChessPropreties implements DiagonalMove{
    private int i;
    private int j;
   // private int tempX, tempY;
public Elephant(int x, int y){
    setXAndY(x,y);
}
    @Override
    public void checkForBorders(boolean bp) {
checkDownRight(bp);
checkDownLeft(bp);
checkUpRight(bp);
checkUpLeft(bp);

    }
@Override
    public void checkUpRight(boolean bp) {
        j = y + 1;

for(i = x + 1; i < 8 && j < 8 ; i++, j++) {
if(Board.checkIcon(i,j)==null){
    listX.add(i);
    listY.add(j);
}
else{
    checkingForOponnets(i, j, bp);
break;
}
}
    }
@Override
    public void checkDownRight(boolean bp) {
        j = y + 1;
        for(i = x - 1; i > -1 && j < 8 ; i--, j++) {
            if(Board.checkIcon(i,j)==null){
                listX.add(i);
                listY.add(j);
            }
            else{
                checkingForOponnets(i, j, bp);
                break;
            }
        }





    }
@Override
    public void checkDownLeft(boolean bp) {
        j = y - 1;
        for(i = x - 1; i > -1 && j > -1 ; i--, j--) {
            if(Board.checkIcon(i,j)==null){
                listX.add(i);
                listY.add(j);
            }
            else{
                checkingForOponnets(i, j, bp);
                break;
            }
        }

    }
@Override
    public void checkUpLeft(boolean bp) {
        j = y - 1;
        for(i = x + 1; i < 8 && j > -1 ; i++, j--) {
            if(Board.checkIcon(i,j)==null){
                listX.add(i);
                listY.add(j);
            }
            else{
                checkingForOponnets(i, j, bp);
                break;
            }
        }

    }


}
