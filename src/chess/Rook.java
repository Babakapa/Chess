package chess;

/**
 * Created by Асус on 14.06.2017.
 */
public class Rook extends ChessPropreties{
public Rook(int x, int y){
    setXAndY(x,y);
}
    @Override
    public void checkForBorders() {
for (int i = x + 1; i < 8; i++) {
    if (Board.checkIcon(i, y) == null) {
        listX.add(i);
        listY.add(y);
    }
    else break;
}
    for (int i = x - 1; i > -1; i--) {
        if (Board.checkIcon(i, y) == null) {
            listX.add(i);
            listY.add(y);
        }
        else break;
    }
        for (int i = y + 1; i < 8; i++) {
            if (Board.checkIcon(x, i) == null) {
                listX.add(x);
                listY.add(i);
            }
            else break;
        }
            for (int i = y - 1; i > -1; i--) {
                if (Board.checkIcon(x, i) == null) {
                    listX.add(x);
                    listY.add(i);
                }
                else break;
            }




    }
}
