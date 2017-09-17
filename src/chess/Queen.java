package chess;

/**
 * Created by Асус on 14.06.2017.
 */
public class Queen extends ChessPropreties implements DiagonalMove, RightLeftUpDownMove {
private int i,j;

    public Queen(int x, int y){
        setXAndY(x,y);
    }
    @Override
    public void checkForBorders() {
        checkDownRight();
        checkDownLeft();
        checkUpRight();
        checkUpLeft();
        checkDown();
checkLeft();
checkRight();
checkUp();
    }
    @Override
    public void checkUpRight() {
        j = y + 1;

        for (i = x + 1; i < 8 && j < 8; i++, j++) {
            if (Board.checkIcon(i, j) == null) {
                listX.add(i);
                listY.add(j);
            } else break;
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
