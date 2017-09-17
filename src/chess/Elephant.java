package chess;


public class Elephant extends ChessPropreties implements DiagonalMove{
    private int i = 0;
    private int j = 0;
public Elephant(int x, int y){
    setXAndY(x,y);
}
    @Override


    public void checkForBorders() {
checkDownRight();
checkDownLeft();
checkUpRight();
checkUpLeft();

    }
@Override
    public void checkUpRight() {
        j = y + 1;

for(i = x + 1; i < 8 && j < 8 ; i++, j++) {
if(Board.checkIcon(i,j)==null){
    listX.add(i);
    listY.add(j);
}
else break;
}

    }
@Override
    public void checkDownRight() {
        j = y + 1;
        for(i = x - 1; i > -1 && j < 8 ; i--, j++) {
            if(Board.checkIcon(i,j)==null){
                listX.add(i);
                listY.add(j);
            }
            else break;
        }
    }
@Override
    public void checkDownLeft() {
        j = y - 1;
        for(i = x - 1; i > -1 && j > -1 ; i--, j--) {
            if(Board.checkIcon(i,j)==null){
                listX.add(i);
                listY.add(j);
            }
            else break;
        }
    }
@Override
    public void checkUpLeft() {
        j = y - 1;
        for(i = x + 1; i < 8 && j > -1 ; i++, j--) {
            if(Board.checkIcon(i,j)==null){
                listX.add(i);
                listY.add(j);
            }
            else break;
        }
    }


}
