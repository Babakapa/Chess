package chess;



import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;



public class Board extends Chess{
private static JButton [][] chess  = new JButton[8][8];
private Icon tempIMG = null;

    private ChessPropreties nameOfTheFigure = null;

  private LinkedList<Color> tempList = new LinkedList<>();

private int i = 0;
private int j = 0;




    public Board() {
setLayout(new GridLayout(8,8));
for(i = 0;i < chess.length;i++)
    for(j = 0;j < chess[i].length;j++) {
        chess[i][j] = new JButton();
        add(chess[i][j]);
chess[i][j].addActionListener(new Listener(i,j));
    }


   makeField();



    }




    private class Listener implements ActionListener{
private int a,b;
public Listener(int a, int b){
    this.a = a;
    this.b = b;
}
        @Override
        public void actionPerformed(ActionEvent e) {
    if(chess[a][b].getBackground()==Color.RED) {
        removeFromBoard(b,a);
        chess[a][b].setIcon(tempIMG);
        chess[nameOfTheFigure.getY()][nameOfTheFigure.getX()].setIcon(null);
        setNewXAndY(a, b);
        clearPossibleVariants();
        white = !white;

     //  setKingAttack();
       // updateBlackStrokes();
        //updateWhiteStrokes();
    }
          else if(chess[a][b].getIcon()!=null) {
                clearPossibleVariants();
                nameOfTheFigure = null;
tempIMG = chess[a][b].getIcon();
                if(white){
                    nameOfTheFigure = gettingRightWhiteObject(b,a);
                }
                else if(!white){
                    nameOfTheFigure = gettingRightBlackObject(b,a);
                }
                if(nameOfTheFigure!=null)
                processing();

            }

  else if(chess[a][b].getBackground()!=Color.blue && !list.isEmpty() && chess[a][b].getBackground()!=Color.RED){
       clearPossibleVariants();

    }
else
    if(nameOfTheFigure!=null){
        chess[nameOfTheFigure.getY()][nameOfTheFigure.getX()].setIcon(null);

        chess[a][b].setIcon(tempIMG);

    setNewXAndY(a, b);
clearPossibleVariants();
white=!white;
//setKingAttack();
//updateBlackStrokes();
//updateWhiteStrokes();

  }
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

        nameOfTheFigure.setXAndY(b,a);

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
    list = nameOfTheFigure.checkForBorders(true);
}
else{
    list = nameOfTheFigure.checkForBorders(false);
}


        showPossibleVariants();


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
        for (int i = 0; i < list.get(2).size(); i++) {
                tempList.add(chess[list.get(3).get(i)][list.get(2).get(i)].getBackground());
                chess[list.get(3).get(i)][list.get(2).get(i)].setBackground(Color.red);
            }

    }
    private void clearPossibleVariants() {
int i, k = 0;
        if(!tempList.isEmpty()) {
            for (i = 0; i < list.get(0).size(); i++,k++) {
                chess[list.get(1).get(i)][list.get(0).get(i)].setBackground(tempList.get(i));
            }
            k = 0;
           while(i < tempList.size()){
               chess[list.get(3).get(k)][list.get(2).get(k)].setBackground(tempList.get(i));
                i++;
                k++;
           }
            tempList.clear();
        }
    }
public static Icon checkIcon(int a, int b){
        return chess[b][a].getIcon();
    }
public static boolean checkForCorrectness(int x, int y){
    ChessPropreties temp = null;
    if(white){
        temp = gettingRightBlackObject(x,y);
    }
    else if(!white){
        temp = gettingRightWhiteObject(x,y);
    }

 if(temp!=null && temp.getX()==x && temp.getY()==y){
     return true;
 }

    return false;
}

}









