package chess;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;



public class Board extends Chess{

private Icon tempIMG = null;
    private static ChessPropreties nameOfTheFigure = null;
  private LinkedList<Color> tempList = new LinkedList<>();
private JPanel panelForChess = new JPanel();
private static int castlingX = -1;
    private static int castlingY = -1;
    private static int secondCastlingX = -1;
    private static int secondCastlingY = -1;
   private Color castlingColor = null;
   private Color secondCastlingColor = null;
    private LinkedList<Color> redList = new LinkedList<>();
private int i = 0;
private int j = 0;
private static ChooseYourFigure addingFigure = null;
private JPanel music = Music.getInstance();
    public Board() {
        setLayout(new BorderLayout());
panelForChess.setLayout(new GridLayout(8,8));
        add(labelForAttack,BorderLayout.NORTH);

      add(panelForChess,BorderLayout.CENTER);
        add(music,BorderLayout.EAST);
for(i = 0;i < chess.length;i++)
    for(j = 0;j < chess[i].length;j++) {
        chess[i][j] = new JButton();
        panelForChess.add(chess[i][j]);
        chess[i][j].addActionListener(new Listener(i, j));
    }


   makeField();

    }




    private class Listener implements ActionListener {
        private int a, b;

        public Listener(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (chess[a][b].getBackground() == Color.RED) {
                removeFromBoard(b, a);
                chess[a][b].setIcon(tempIMG);
                chess[nameOfTheFigure.getY()][nameOfTheFigure.getX()].setIcon(null);
                setNewXAndY(a, b);
                clearPossibleVariants();
                white = !white;
                setKingAttack();

                checkForPawnGetEnd();
                updateWhiteStrokes();
                updateBlackStrokes();
kingAttack();

            } else if (chess[a][b].getIcon() != null) {
                clearPossibleVariants();
                nameOfTheFigure = null;
                tempIMG = chess[a][b].getIcon();
                if (white) {
                    nameOfTheFigure = gettingRightWhiteObject(b, a);
                } else if (!white) {
                    nameOfTheFigure = gettingRightBlackObject(b, a);
                }
                if (nameOfTheFigure != null)
                    processing();

            } else if (chess[a][b].getBackground() != Color.blue && !list.isEmpty() && chess[a][b].getBackground() != Color.RED) {
                clearPossibleVariants();

            } else if (nameOfTheFigure != null) {
                chess[nameOfTheFigure.getY()][nameOfTheFigure.getX()].setIcon(null);

                chess[a][b].setIcon(tempIMG);

                setNewXAndY(a, b);
                clearPossibleVariants();
                white = !white;
                setKingAttack();

checkForPawnGetEnd();
                updateWhiteStrokes();
                updateBlackStrokes();
                if(nameOfTheFigure.getClass()==King.class) {
                    checkForCastling();
                }
kingAttack();

            }
        }
    }

    private void checkForCastling() {
       if(nameOfTheFigure.getX()==6 && nameOfTheFigure.getY()==7){
           chess[7][5].setIcon(chess[whiteRook2.getY()][whiteRook2.getX()].getIcon());
           chess[whiteRook2.getY()][whiteRook2.getX()].setIcon(null);
           whiteRook2.setXAndY(5,7);

       }
        if(nameOfTheFigure.getX()==2 && nameOfTheFigure.getY()==7){
            chess[7][3].setIcon(chess[whiteRook1.getY()][whiteRook1.getX()].getIcon());
            chess[whiteRook1.getY()][whiteRook1.getX()].setIcon(null);
            whiteRook1.setXAndY(3,7);

        }
        if(nameOfTheFigure.getX()==6 && nameOfTheFigure.getY()==0){
            chess[0][5].setIcon(chess[blackRook2.getY()][blackRook2.getX()].getIcon());
            chess[blackRook2.getY()][blackRook2.getX()].setIcon(null);
            blackRook2.setXAndY(5,0);

        }
        if(nameOfTheFigure.getX()==2 && nameOfTheFigure.getY()==0){
            chess[0][3].setIcon(chess[blackRook1.getY()][blackRook1.getX()].getIcon());
            chess[blackRook1.getY()][blackRook1.getX()].setIcon(null);
            blackRook1.setXAndY(3,0);

        }

    }

    private void checkForPawnGetEnd() {
        if(nameOfTheFigure.getClass()==Pawn.class && nameOfTheFigure.getY()==7){
addingFigure = new ChooseYourFigure(nameOfTheFigure,nameOfTheFigure.getX(),nameOfTheFigure.getY());
nameOfTheFigure.setXAndY(-1,-1);
        }
else if(nameOfTheFigure.getClass()==WhitePawn.class && nameOfTheFigure.getY()==0){
            addingFigure = new ChooseYourFigure(nameOfTheFigure,nameOfTheFigure.getX(),nameOfTheFigure.getY());
nameOfTheFigure.setXAndY(-1,-1);
        }

    }



    private void removeFromBoard(int x, int y) {
        if(white){
            ChessPropreties temp = gettingRightBlackObject(x,y);
            temp.setXAndY(-1,-1);
        }
        else if(!white){
            ChessPropreties temp = gettingRightWhiteObject(x,y);
            temp.setXAndY(-1,-1);
        }
    }

    private static void setKingAttack(){
        if(blackKingIsunderAttack){
            blackKingIsunderAttack = false;
        }
        else if(whiteKingIsUnderAttack){
            whiteKingIsUnderAttack = false;
        }

    }
    private void setNewXAndY(int a, int b) {
if(nameOfTheFigure.getClass()==Pawn.class || nameOfTheFigure.getClass()==WhitePawn.class || nameOfTheFigure.getClass()==King.class || nameOfTheFigure.getClass()==Rook.class) {
    nameOfTheFigure.setXAndY(b, a);
    nameOfTheFigure.setFirstStep();
}
else nameOfTheFigure.setXAndY(b,a);

    }




    private void makeField() {
        boolean bp = true;
        for(i = 0;i < chess.length;i++) {
            bp = !bp;
            for (j = 0; j < chess[i].length; j++) {
                if (bp) {
                    chess[i][j].setBackground(new Color(139, 69, 19));
                    bp = !bp;
                } else {
                    chess[i][j].setBackground(Color.WHITE);
                    bp = !bp;
                }
            }
        }
        chess[0][4].setIcon(new ImageIcon("src\\Images\\moderator_male-96.png"));

        chess[1][0].setIcon(new ImageIcon("src\\Images\\Pawn-icon0.png"));
        chess[1][1].setIcon(new ImageIcon("src\\Images\\Pawn-icon0.png"));
        chess[1][2].setIcon(new ImageIcon("src\\Images\\Pawn-icon0.png"));
        chess[1][3].setIcon(new ImageIcon("src\\Images\\Pawn-icon0.png"));
        chess[1][4].setIcon(new ImageIcon("src\\Images\\Pawn-icon0.png"));
        chess[1][5].setIcon(new ImageIcon("src\\Images\\Pawn-icon0.png"));
        chess[1][6].setIcon(new ImageIcon("src\\Images\\Pawn-icon0.png"));
        chess[1][7].setIcon(new ImageIcon("src\\Images\\Pawn-icon0.png"));

        chess[0][1].setIcon(new ImageIcon("src\\Images\\Horse1.png"));
        chess[0][6].setIcon(new ImageIcon("src\\Images\\Horse1.png"));

        chess[0][0].setIcon(new ImageIcon("src\\Images\\rook1.png"));
        chess[0][7].setIcon(new ImageIcon("src\\Images\\rook1.png"));

        chess[0][2].setIcon(new ImageIcon("src\\Images\\elephant1.png"));
        chess[0][5].setIcon(new ImageIcon("src\\Images\\elephant1.png"));

        chess[0][3].setIcon(new ImageIcon("src\\Images\\blackqueen.png"));
        //WhiteFigures

        chess[7][4].setIcon(new ImageIcon("src\\Images\\whiteking.png"));

        chess[6][0].setIcon(new ImageIcon("src\\Images\\whitepawn.png"));
        chess[6][1].setIcon(new ImageIcon("src\\Images\\whitepawn.png"));
        chess[6][2].setIcon(new ImageIcon("src\\Images\\whitepawn.png"));
        chess[6][3].setIcon(new ImageIcon("src\\Images\\whitepawn.png"));
        chess[6][4].setIcon(new ImageIcon("src\\Images\\whitepawn.png"));
        chess[6][5].setIcon(new ImageIcon("src\\Images\\whitepawn.png"));
        chess[6][6].setIcon(new ImageIcon("src\\Images\\whitepawn.png"));
        chess[6][7].setIcon(new ImageIcon("src\\Images\\whitepawn.png"));

        chess[7][1].setIcon(new ImageIcon("src\\Images\\whiteHorse.png"));
        chess[7][6].setIcon(new ImageIcon("src\\Images\\whiteHorse.png"));

        chess[7][0].setIcon(new ImageIcon("src\\Images\\whiterook.png"));
        chess[7][7].setIcon(new ImageIcon("src\\Images\\whiterook.png"));

        chess[7][2].setIcon(new ImageIcon("src\\Images\\whiteelephant.png"));
        chess[7][5].setIcon(new ImageIcon("src\\Images\\whiteelephant.png"));

        chess[7][3].setIcon(new ImageIcon("src\\Images\\queenwhite.png"));


    }

    private void processing() {
if(white){
    list.clear();
    list = nameOfTheFigure.checkForBorders(true);
}
else{
    list.clear();
    list = nameOfTheFigure.checkForBorders(false);
}

if(!white) {
    checkForBlackStrokes();
    if(nameOfTheFigure.getX()==king.getX() && nameOfTheFigure.getY()==king.getY())
        checkForBlackCastlimg();

}
else {
    checkForWhiteStrokes();
    if(nameOfTheFigure.getX()==whiteking.getX() && nameOfTheFigure.getY()==whiteking.getY())
        checkForWhiteCastlimg();
}

        showPossibleVariants();


    }

    private void checkForWhiteCastlimg() {

        if(nameOfTheFigure.getFirstStep() && whiteRook2.getFirstStep() && !whiteKingIsUnderAttack){

            for(int i = 0;i<list.get(0).size();i++){

                if(list.get(0).get(i)==5 && list.get(1).get(i)==7 && !Chess.checkForCorrectness(6,7)){

                    nameOfTheFigure.setXAndY(6,7);
                    updateBlackStrokes();
                    nameOfTheFigure.setXAndY(4,7);
                    if(!whiteKingIsUnderAttack){
                        castlingX = 6;
                        castlingY = 7;
                        break;
                    }
                   else {
                        whiteKingIsUnderAttack = false;
                    }
                }

            }

        }
        // 4 7
        if(nameOfTheFigure.getFirstStep() && whiteRook1.getFirstStep() && !whiteKingIsUnderAttack){
                if(!Chess.checkForCorrectness(3,7)){
                    nameOfTheFigure.setXAndY(3,7);
                    updateBlackStrokes();
                    nameOfTheFigure.setXAndY(4,7);
                    if(!whiteKingIsUnderAttack){
                        if(!Chess.checkForCorrectness(2,7)){
                            nameOfTheFigure.setXAndY(2,7);
                            updateBlackStrokes();
                            nameOfTheFigure.setXAndY(4,7);
                            if(!whiteKingIsUnderAttack){
                                if(!Chess.checkForCorrectness(1,7)){
                                    secondCastlingX = 2;
                                    secondCastlingY = 7;
                                }
                                else return;
                            }
                            else {
                                whiteKingIsUnderAttack = false;
                                return;
                            }
                        }
                        else return;
                    }
                    else
                    {
                        whiteKingIsUnderAttack = false;
                        return;
                    }

                }
                else return;





        }




    }

    private void checkForBlackCastlimg() {

        if(nameOfTheFigure.getFirstStep() && blackRook2.getFirstStep() && !blackKingIsunderAttack){

            for(int i = 0;i<list.get(0).size();i++){

                if(list.get(0).get(i)==5 && list.get(1).get(i)==0 && !Chess.checkForCorrectness(6,0)){

                    nameOfTheFigure.setXAndY(6,0);
                    updateWhiteStrokes();
                    nameOfTheFigure.setXAndY(4,0);
                    if(!blackKingIsunderAttack){
                        castlingX = 6;
                        castlingY = 0;
                        break;
                    }
                    else {
                        blackKingIsunderAttack = false;
                    }
                }

            }

        }
        if(nameOfTheFigure.getFirstStep() && blackRook1.getFirstStep() && !blackKingIsunderAttack){
            if(!Chess.checkForCorrectness(3,0)){
                nameOfTheFigure.setXAndY(3,0);
                updateWhiteStrokes();
                nameOfTheFigure.setXAndY(4,0);
                if(!blackKingIsunderAttack){
                    if(!Chess.checkForCorrectness(2,0)){
                        nameOfTheFigure.setXAndY(2,0);
                        updateWhiteStrokes();
                        nameOfTheFigure.setXAndY(4,0);
                        if(!blackKingIsunderAttack){
                            if(!Chess.checkForCorrectness(1,0)){
                                secondCastlingX = 2;
                                secondCastlingY = 0;
                            }
                            else return;
                        }
                        else {
                            blackKingIsunderAttack = false;
                            return;
                        }
                    }
                    else return;
                }
                else
                {
                    blackKingIsunderAttack = false;
                    return;
                }

            }
            else return;





        }


    }

    private void checkForBlackStrokes() {
        int x = nameOfTheFigure.getX();
        int y = nameOfTheFigure.getY();
boolean bp  = blackKingIsunderAttack;
        LinkedList<LinkedList<Integer>> temp = new LinkedList<>();
        for (int i = 0;i<4;i++) {
            temp.add(new LinkedList<>());
        }
        for(int i = 0;i<list.get(0).size();i++){
            temp.get(0).add(list.get(0).get(i));
            temp.get(1).add(list.get(1).get(i));
        }

        for(int i = 0;i<list.get(2).size();i++){
            temp.get(2).add(list.get(2).get(i));
            temp.get(3).add(list.get(3).get(i));
        }

        for(int i = 0; i < temp.get(0).size();i++){
            nameOfTheFigure.setXAndY(temp.get(0).get(i),temp.get(1).get(i));
            blackKingIsunderAttack = false;
            updateWhiteStrokes();
            if(blackKingIsunderAttack){
                temp.get(0).remove(i);
                temp.get(1).remove(i);
                    i--;
            }
        }


        for(int i = 0; i < temp.get(2).size();i++){
            ChessPropreties tempFigure = gettingRightWhiteObject(temp.get(2).get(i),temp.get(3).get(i));
            int tempX = tempFigure.getX();
            int tempY = tempFigure.getY();
            tempFigure.setXAndY(-1,-1);
            nameOfTheFigure.setXAndY(temp.get(2).get(i),temp.get(3).get(i));
            blackKingIsunderAttack = false;
            updateWhiteStrokes();
            if(blackKingIsunderAttack){
                temp.get(2).remove(i);
                temp.get(3).remove(i);
                i--;
            }
            tempFigure.setXAndY(tempX,tempY);

        }
        list.get(0).clear();
        list.get(1).clear();
        list.get(2).clear();
        list.get(3).clear();
        for(int i = 0;i<temp.get(0).size();i++){
            list.get(0).add(temp.get(0).get(i));
            list.get(1).add(temp.get(1).get(i));
        }
        for(int i = 0;i<temp.get(2).size();i++){
            list.get(2).add(temp.get(2).get(i));
            list.get(3).add(temp.get(3).get(i));
        }

        nameOfTheFigure.setXAndY(x,y);
        blackKingIsunderAttack = bp;

    }

    private void checkForWhiteStrokes() {
        int x = nameOfTheFigure.getX();
        int y = nameOfTheFigure.getY();
boolean bp = whiteKingIsUnderAttack;
        LinkedList<LinkedList<Integer>> temp = new LinkedList<>();
        for (int i = 0;i<4;i++) {
            temp.add(new LinkedList<>());
        }
        for(int i = 0;i<list.get(0).size();i++){
            temp.get(0).add(list.get(0).get(i));
            temp.get(1).add(list.get(1).get(i));
        }

        for(int i = 0;i<list.get(2).size();i++){
            temp.get(2).add(list.get(2).get(i));
            temp.get(3).add(list.get(3).get(i));
        }

        for(int i = 0; i < temp.get(0).size();i++){
            nameOfTheFigure.setXAndY(temp.get(0).get(i),temp.get(1).get(i));
            whiteKingIsUnderAttack = false;
            updateBlackStrokes();
            if(whiteKingIsUnderAttack){
                temp.get(0).remove(i);
                temp.get(1).remove(i);
                i--;
            }


        }
        for(int i = 0; i < temp.get(2).size();i++){
            ChessPropreties tempFigure = gettingRightBlackObject(temp.get(2).get(i),temp.get(3).get(i));
            int tempX = tempFigure.getX();
            int tempY = tempFigure.getY();
            tempFigure.setXAndY(-1,-1);
            nameOfTheFigure.setXAndY(temp.get(2).get(i),temp.get(3).get(i));
            whiteKingIsUnderAttack = false;
            updateBlackStrokes();
            if(whiteKingIsUnderAttack){
                temp.get(2).remove(i);
                temp.get(3).remove(i);
                i--;
            }
            tempFigure.setXAndY(tempX,tempY);

        }

        list.get(0).clear();
        list.get(1).clear();
        list.get(2).clear();
        list.get(3).clear();
        for(int i = 0;i<temp.get(0).size();i++){
            list.get(0).add(temp.get(0).get(i));
            list.get(1).add(temp.get(1).get(i));
        }
        for(int i = 0;i<temp.get(2).size();i++){
            list.get(2).add(temp.get(2).get(i));
            list.get(3).add(temp.get(3).get(i));
        }

        nameOfTheFigure.setXAndY(x,y);
        whiteKingIsUnderAttack = bp;


    }

    private void showPossibleVariants() {

    for (int i = 0; i < list.get(0).size(); i++) {
        if(chess[list.get(1).get(i)][list.get(0).get(i)].getIcon() == null) {
            tempList.add(chess[list.get(1).get(i)][list.get(0).get(i)].getBackground());
            chess[list.get(1).get(i)][list.get(0).get(i)].setBackground(Color.blue);
        }
        else{
            list.get(1).remove(i);
            list.get(0).remove(i);
            i--;
        }
    }
        if(secondCastlingX!=-1){
            secondCastlingColor = chess[secondCastlingY][secondCastlingX].getBackground();
            chess[secondCastlingY][secondCastlingX].setBackground(Color.blue);
        }
        if(castlingX!=-1){
            castlingColor = chess[castlingY][castlingX].getBackground();
            chess[castlingY][castlingX].setBackground(Color.blue);
        }
        for (int i = 0; i < list.get(2).size(); i++) {
                tempList.add(chess[list.get(3).get(i)][list.get(2).get(i)].getBackground());
                chess[list.get(3).get(i)][list.get(2).get(i)].setBackground(Color.red);
            }


    }
    private void clearPossibleVariants() {
int i, k = 0;

        if(!tempList.isEmpty()) {
            for (i = 0; i < list.get(0).size(); i++) {
                chess[list.get(1).get(i)][list.get(0).get(i)].setBackground(tempList.get(i));
            }

            while (i < tempList.size()) {
                chess[list.get(3).get(k)][list.get(2).get(k)].setBackground(tempList.get(i));
                k++;
                i++;
            }
            tempList.clear();
        }




if (castlingColor!=null){
        chess[castlingY][castlingX].setBackground(castlingColor);
        castlingY = -1;
        castlingX = -1;
        castlingColor = null;
}
        if (secondCastlingColor!=null){
            chess[secondCastlingY][secondCastlingX].setBackground(secondCastlingColor);
            secondCastlingX = -1;
            secondCastlingX = -1;
            secondCastlingColor = null;
        }

    }



public static Icon checkIcon(int a, int b){
        return chess[b][a].getIcon();
    }


}









