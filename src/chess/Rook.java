package chess;

/**
 * Created by Асус on 14.06.2017.
 */
public class Rook extends ChessPropreties implements RightLeftUpDownMove{
public Rook(int x, int y){
    setXAndY(x,y);
}
    @Override
    public void checkForBorders() {
    checkLeft();
    checkRight();
    checkUp();
    checkDown();







    }

    @Override
    public void checkUp() {
        for (int i = y + 1; i < 8; i++) {
            if (Board.checkIcon(x, i) == null) {
                listX.add(x);
                listY.add(i);
            }
            else break;
        }
    }

    @Override
    public void checkDown() {

        for (int i = y - 1; i > -1; i--) {
            if (Board.checkIcon(x, i) == null) {
                listX.add(x);
                listY.add(i);
            }
            else break;
        }

    }

    @Override
    public void checkRight() {
        for (int i = x + 1; i < 8; i++) {
            if (Board.checkIcon(i, y) == null) {
                listX.add(i);
                listY.add(y);
            }
            else break;
        }
    }

    @Override
    public void checkLeft() {
        for (int i = x - 1; i > -1; i--) {
            if (Board.checkIcon(i, y) == null) {
                listX.add(i);
                listY.add(y);
            }
            else break;
        }

    }
}
