package chess;



import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;



public class Board extends Chess{
private static JButton [][] chess  = new JButton[8][8];
private GetTurn turn = new GetTurn();


    private String nameOfTheFigure = null;

  private LinkedList<Color> tempList = new LinkedList<>();
private boolean white = true;
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

makeStrokes();
    }




    private class Listener implements ActionListener{
private int a,b;
public Listener(int a, int b){
    this.a = a;
    this.b = b;
}
        @Override
        public void actionPerformed(ActionEvent e) {
            if(chess[a][b].getIcon()!=null) {
                clearPossibleVariants();
                nameOfTheFigure = null;

                if(white && turn.getTurn(white, ChoosingRightFigure.chooseFigure(chess[a][b].getIcon()))){
                    nameOfTheFigure = ChoosingRightFigure.chooseFigure(chess[a][b].getIcon());
                }
                else if(!white && turn.getTurn(white, ChoosingRightFigure.chooseFigure(chess[a][b].getIcon()))){
                    nameOfTheFigure = ChoosingRightFigure.chooseFigure(chess[a][b].getIcon());
                }
                if(nameOfTheFigure!=null)
                processing();

            }
            else if(chess[a][b].getBackground()==Color.RED) {
                chess[a][b].setIcon(ChoosingRightIcon.getIcon(nameOfTheFigure));
                setNewXAndY(nameOfTheFigure, a, b);
                clearPossibleVariants();
                white=!white;

            }
  else if(chess[a][b].getBackground()!=Color.blue && !list.isEmpty() && chess[a][b].getBackground()!=Color.RED){
       clearPossibleVariants();

    }
else if(nameOfTheFigure!=null){
    chess[a][b].setIcon(ChoosingRightIcon.getIcon(nameOfTheFigure));
    setNewXAndY(nameOfTheFigure, a, b);
clearPossibleVariants();
white=!white;
    }



}




    }
    private void setNewXAndY(String nameOfTheFigure, int a, int b) {
        if(nameOfTheFigure=="BlackKing"){
            chess[king.getY()][king.getX()].setIcon(null);
            king.setXAndY(b,a);
        }
        if(nameOfTheFigure=="BlackPawn0"){
            chess[pawn0.getY()][pawn0.getX()].setIcon(null);
            pawn0.setXAndY(b,a);
            pawn0.setFirstStep();
        }
        if(nameOfTheFigure=="BlackPawn1"){
            chess[pawn1.getY()][pawn1.getX()].setIcon(null);
            pawn1.setXAndY(b,a);
            pawn1.setFirstStep();
        }
        if(nameOfTheFigure=="BlackPawn2"){
            chess[pawn2.getY()][pawn2.getX()].setIcon(null);
            pawn2.setXAndY(b,a);
            pawn2.setFirstStep();
        }
        if(nameOfTheFigure=="BlackPawn3"){
            chess[pawn3.getY()][pawn3.getX()].setIcon(null);
            pawn3.setXAndY(b,a);
            pawn3.setFirstStep();
        }
        if(nameOfTheFigure=="BlackPawn4"){
            chess[pawn4.getY()][pawn4.getX()].setIcon(null);
            pawn4.setXAndY(b,a);
            pawn4.setFirstStep();
        }
        if(nameOfTheFigure=="BlackPawn5"){
            chess[pawn5.getY()][pawn5.getX()].setIcon(null);
            pawn5.setXAndY(b,a);
            pawn5.setFirstStep();
        }
        if(nameOfTheFigure=="BlackPawn6"){
            chess[pawn6.getY()][pawn6.getX()].setIcon(null);
            pawn6.setXAndY(b,a);
            pawn6.setFirstStep();
        }
        if(nameOfTheFigure=="BlackPawn7"){
            chess[pawn7.getY()][pawn7.getX()].setIcon(null);
            pawn7.setXAndY(b,a);
            pawn7.setFirstStep();
        }
        if(nameOfTheFigure=="BlackHorse1"){
            chess[blackHorse1.getY()][blackHorse1.getX()].setIcon(null);
            blackHorse1.setXAndY(b,a);
        }
        if(nameOfTheFigure=="BlackHorse2"){
            chess[blackHorse2.getY()][blackHorse2.getX()].setIcon(null);
            blackHorse2.setXAndY(b,a);
        }
        if(nameOfTheFigure=="BlackRook1"){
            chess[blackRook1.getY()][blackRook1.getX()].setIcon(null);
            blackRook1.setXAndY(b,a);
        }
        if(nameOfTheFigure=="BlackRook2"){
            chess[blackRook2.getY()][blackRook2.getX()].setIcon(null);
            blackRook2.setXAndY(b,a);
        }
        if(nameOfTheFigure=="BlackElephant1"){
            chess[blackElephant1.getY()][blackElephant1.getX()].setIcon(null);
            blackElephant1.setXAndY(b,a);
        }

        if(nameOfTheFigure=="BlackElephant2"){
            chess[blackElephant2.getY()][blackElephant2.getX()].setIcon(null);
            blackElephant2.setXAndY(b,a);
        }
        if(nameOfTheFigure=="BlackQueen"){
            chess[blackQueen.getY()][blackQueen.getX()].setIcon(null);
            blackQueen.setXAndY(b,a);
        }

//White Chess

        if(nameOfTheFigure=="WhiteKing"){
            chess[whiteking.getY()][whiteking.getX()].setIcon(null);
            whiteking.setXAndY(b,a);
        }
        if(nameOfTheFigure=="WhitePawn0"){
            chess[whitepawn0.getY()][whitepawn0.getX()].setIcon(null);
           whitepawn0.setXAndY(b,a);
            whitepawn0.setFirstStep();
            System.out.print(whitepawn0.getY()+ " "+whitepawn0.getX());
        }
        if(nameOfTheFigure=="WhitePawn1"){
            chess[whitepawn1.getY()][whitepawn1.getX()].setIcon(null);
            whitepawn1.setXAndY(b,a);
            whitepawn1.setFirstStep();
        }
        if(nameOfTheFigure=="WhitePawn2"){
            chess[whitepawn2.getY()][whitepawn2.getX()].setIcon(null);
            whitepawn2.setXAndY(b,a);
            whitepawn2.setFirstStep();
        }
        if(nameOfTheFigure=="WhitePawn3"){
            chess[whitepawn3.getY()][whitepawn3.getX()].setIcon(null);
            whitepawn3.setXAndY(b,a);
            whitepawn3.setFirstStep();
        }
        if(nameOfTheFigure=="WhitePawn4"){
            chess[whitepawn4.getY()][whitepawn4.getX()].setIcon(null);
            whitepawn4.setXAndY(b,a);
            whitepawn4.setFirstStep();
        }
        if(nameOfTheFigure=="WhitePawn5"){
            chess[whitepawn5.getY()][whitepawn5.getX()].setIcon(null);
            whitepawn5.setXAndY(b,a);
            whitepawn5.setFirstStep();
        }
        if(nameOfTheFigure=="WhitePawn6"){
            chess[whitepawn6.getY()][whitepawn6.getX()].setIcon(null);
            whitepawn6.setXAndY(b,a);
            whitepawn6.setFirstStep();
        }
        if(nameOfTheFigure=="WhitePawn7"){
            chess[whitepawn7.getY()][whitepawn7.getX()].setIcon(null);
            whitepawn7.setXAndY(b,a);
            whitepawn7.setFirstStep();
        }
        if(nameOfTheFigure=="WhiteHorse1"){
            chess[whiteHorse1.getY()][whiteHorse1.getX()].setIcon(null);
            whiteHorse1.setXAndY(b,a);
        }
        if(nameOfTheFigure=="WhiteHorse2"){
            chess[whiteHorse2.getY()][whiteHorse2.getX()].setIcon(null);
            whiteHorse2.setXAndY(b,a);
        }
        if(nameOfTheFigure=="WhiteRook1"){
            chess[whiteRook1.getY()][whiteRook1.getX()].setIcon(null);
            whiteRook1.setXAndY(b,a);
        }
        if(nameOfTheFigure=="WhiteRook2"){
            chess[whiteRook2.getY()][whiteRook2.getX()].setIcon(null);
            whiteRook2.setXAndY(b,a);
        }
        if(nameOfTheFigure=="WhiteElephant1"){
            chess[whiteElephant1.getY()][whiteElephant1.getX()].setIcon(null);
            whiteElephant1.setXAndY(b,a);
        }

        if(nameOfTheFigure=="WhiteElephant2"){
            chess[whiteElephant2.getY()][whiteElephant2.getX()].setIcon(null);
            whiteElephant2.setXAndY(b,a);
        }
        if(nameOfTheFigure=="WhiteQueen"){
            chess[whiteQueen.getY()][whiteQueen.getX()].setIcon(null);
            whiteQueen.setXAndY(b,a);
        }




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
        chess[1][1].setIcon(new ImageIcon("src\\Images\\Pawn-icon1.png"));
        chess[1][2].setIcon(new ImageIcon("src\\Images\\Pawn-icon2.png"));
        chess[1][3].setIcon(new ImageIcon("src\\Images\\Pawn-icon3.png"));
        chess[1][4].setIcon(new ImageIcon("src\\Images\\Pawn-icon4.png"));
        chess[1][5].setIcon(new ImageIcon("src\\Images\\Pawn-icon5.png"));
        chess[1][6].setIcon(new ImageIcon("src\\Images\\Pawn-icon6.png"));
        chess[1][7].setIcon(new ImageIcon("src\\Images\\Pawn-icon7.png"));

        chess[0][1].setIcon(new ImageIcon("src\\Images\\Horse1.png"));
        chess[0][6].setIcon(new ImageIcon("src\\Images\\Horse2.png"));

        chess[0][0].setIcon(new ImageIcon("src\\Images\\rook1.png"));
        chess[0][7].setIcon(new ImageIcon("src\\Images\\rook2.png"));

        chess[0][2].setIcon(new ImageIcon("src\\Images\\elephant1.png"));
        chess[0][5].setIcon(new ImageIcon("src\\Images\\elephant2.png"));

        chess[0][3].setIcon(new ImageIcon("src\\Images\\blackqueen.png"));
        //WhiteFigures

        chess[7][4].setIcon(new ImageIcon("src\\Images\\whiteking.png"));

        chess[6][0].setIcon(new ImageIcon("src\\Images\\whitepawn.png"));
        chess[6][1].setIcon(new ImageIcon("src\\Images\\whitepawn1.png"));
        chess[6][2].setIcon(new ImageIcon("src\\Images\\whitepawn2.png"));
        chess[6][3].setIcon(new ImageIcon("src\\Images\\whitepawn3.png"));
        chess[6][4].setIcon(new ImageIcon("src\\Images\\whitepawn4.png"));
        chess[6][5].setIcon(new ImageIcon("src\\Images\\whitepawn5.png"));
        chess[6][6].setIcon(new ImageIcon("src\\Images\\whitepawn6.png"));
        chess[6][7].setIcon(new ImageIcon("src\\Images\\whitepawn7.png"));

        chess[7][1].setIcon(new ImageIcon("src\\Images\\whiteHorse.png"));
        chess[7][6].setIcon(new ImageIcon("src\\Images\\whiteHorse1.png"));

        chess[7][0].setIcon(new ImageIcon("src\\Images\\whiterook.png"));
        chess[7][7].setIcon(new ImageIcon("src\\Images\\whiterook2.png"));

        chess[7][2].setIcon(new ImageIcon("src\\Images\\whiteelephant.png"));
        chess[7][5].setIcon(new ImageIcon("src\\Images\\whiteelephant1.png"));

        chess[7][3].setIcon(new ImageIcon("src\\Images\\queenwhite.png"));


    }

    private void processing() {

            if (nameOfTheFigure == "BlackKing") {
                list = king.moving(false);
            }
            if (nameOfTheFigure == "BlackPawn0") {
                list = pawn0.moving(false);
            }
            if (nameOfTheFigure == "BlackPawn1") {
                list = pawn1.moving(false);
            }
            if (nameOfTheFigure == "BlackPawn2") {
                list = pawn2.moving(false);
            }
            if (nameOfTheFigure == "BlackPawn3") {
                list = pawn3.moving(false);
            }
            if (nameOfTheFigure == "BlackPawn4") {
                list = pawn4.moving(false);
            }
            if (nameOfTheFigure == "BlackPawn5") {
                list = pawn5.moving(false);
            }
            if (nameOfTheFigure == "BlackPawn6") {
                list = pawn6.moving(false);
            }
            if (nameOfTheFigure == "BlackPawn7") {
                list = pawn7.moving(false);
            }
            if (nameOfTheFigure == "BlackHorse1") {
                list = blackHorse1.moving(false);
            }
            if (nameOfTheFigure == "BlackHorse2") {
                list = blackHorse2.moving(false);
            }
            if (nameOfTheFigure == "BlackRook1") {
                list = blackRook1.moving(false);
            }
            if (nameOfTheFigure == "BlackRook2") {
                list = blackRook2.moving(false);
            }
            if (nameOfTheFigure == "BlackElephant1") {
                list = blackElephant1.moving(false);
            }
            if (nameOfTheFigure == "BlackElephant2") {
                list = blackElephant2.moving(false);
            }
            if (nameOfTheFigure == "BlackQueen") {
                list = blackQueen.moving(false);
            }

            //white



            if (nameOfTheFigure == "WhiteKing") {
                list = whiteking.moving(true);
            }
            if (nameOfTheFigure == "WhitePawn0") {
                list = whitepawn0.moving(true);
            }
            if (nameOfTheFigure == "WhitePawn1") {
                list = whitepawn1.moving(true);
            }
            if (nameOfTheFigure == "WhitePawn2") {
                list = whitepawn2.moving(true);
            }
            if (nameOfTheFigure == "WhitePawn3") {
                list = whitepawn3.moving(true);
            }
            if (nameOfTheFigure == "WhitePawn4") {
                list = whitepawn4.moving(true);
            }
            if (nameOfTheFigure == "WhitePawn5") {
                list = whitepawn5.moving(true);
            }
            if (nameOfTheFigure == "WhitePawn6") {
                list = whitepawn6.moving(true);
            }
            if (nameOfTheFigure == "WhitePawn7") {
                list = whitepawn7.moving(true);
            }
            if (nameOfTheFigure == "WhiteHorse1") {
                list = whiteHorse1.moving(true);
            }
            if (nameOfTheFigure == "WhiteHorse2") {
                list = whiteHorse2.moving(true);
            }
            if (nameOfTheFigure == "WhiteRook1") {
                list = whiteRook1.moving(true);
            }
            if (nameOfTheFigure == "WhiteRook2") {
                list = whiteRook2.moving(true);
            }
            if (nameOfTheFigure == "WhiteElephant1") {
                list = whiteElephant1.moving(true);
            }
            if (nameOfTheFigure == "WhiteElephant2") {
                list = whiteElephant2.moving(true);
            }
            if (nameOfTheFigure == "WhiteQueen") {
                list = whiteQueen.moving(true);
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

}









