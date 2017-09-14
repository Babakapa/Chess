package chess;

public class Horse extends ChessPropreties {


public Horse(int x, int y){
    setXAndY(x,y);
}

    @Override
    public void checkForBorders() {
        if(x - 2 > -1){
            if(y + 1 < 8 && Board.checkIcon(x - 2, y + 1)==null){
                listX.add(x-2);
                listY.add(y+1);
            }
            if(y - 1 > -1 && Board.checkIcon(x - 2, y - 1)==null){
                listX.add(x-2);
                listY.add(y-1);
            }
        }
        if(x + 2 < 8){
            if(y + 1 < 8 && Board.checkIcon(x + 2, y + 1)==null){
                listX.add(x+2);
                listY.add(y+1);
            }
            if(y - 1 > -1 && Board.checkIcon(x + 2, y - 1)==null){
                listX.add(x+2);
                listY.add(y-1);
            }
        }
        if(y - 2 > -1){
            if(x - 1 > -1 && Board.checkIcon(x - 1, y - 2)==null){
                listX.add(x-1);
                listY.add(y-2);
            }
            if(x + 1 < 8 && Board.checkIcon(x + 1, y - 2)==null){
                listX.add(x+1);
                listY.add(y-2);
            }
        }
        if(y + 2 < 8){
            if(x - 1 > -1 && Board.checkIcon(x - 1, y + 2)==null){
                listX.add(x-1);
                listY.add(y+2);

            }
            if(x + 1 < 8 && Board.checkIcon(x + 1, y + 2)==null){
                listX.add(x+1);
                listY.add(y+2);
            }
        }

    }
}
