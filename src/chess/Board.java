package chess;



import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;


public class Board extends JFrame{
private static JButton [][] chess  = new JButton[8][8];
private King king = new King(4,0);
    private Pawn pawn0 = new Pawn(0,1);
    private Pawn pawn1 = new Pawn(1,1);



    private Pawn pawn2 = new Pawn(2,1);
    private Pawn pawn3 = new Pawn(3,1);
    private Pawn pawn4 = new Pawn(4,1);
    private Pawn pawn5 = new Pawn(5,1);
    private Pawn pawn6 = new Pawn(6,1);
    private Pawn pawn7 = new Pawn(7,1);

    private Horse blackHorse1 = new Horse(1,0);
    private Horse blackHorse2 = new Horse(6,0);

private Rook blackRook1 = new Rook(0,0);
    private Rook blackRook2 = new Rook(7,0);

    private Elephant blackElephant1 = new Elephant(2,0);
    private Elephant blackElephant2 = new Elephant(5,0);


private String nameOfTheFigure;
protected LinkedList<LinkedList<Integer>> list= new LinkedList<>();
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
    if(chess[a][b].getIcon()!=null) {
clearPossibleVariants();
        nameOfTheFigure = ChoosingRightFigure.chooseFigure(chess[a][b].getIcon());
        processing();

    }else if(chess[a][b].getBackground()!=Color.blue && !list.isEmpty() && chess[a][b].getBackground()!=Color.RED)
       clearPossibleVariants();
    else if(chess[a][b].getBackground()==Color.RED){

    }
else if(nameOfTheFigure!=null){
    chess[a][b].setIcon(ChoosingRightIcon.getIcon(nameOfTheFigure));
    setNewXAndY(nameOfTheFigure, a, b);
clearPossibleVariants();
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




    }

    private void clearPossibleVariants() {
        if(!tempList.isEmpty()) {
            for (int i = 0; i < list.get(0).size(); i++) {
                chess[list.get(1).get(i)][list.get(0).get(i)].setBackground(tempList.get(i));
            }
            tempList.clear();
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


    }

    private void processing() {
        if(nameOfTheFigure=="BlackKing") {
            list = king.moving();
        }
        if(nameOfTheFigure=="BlackPawn0"){
            list = pawn0.moving();
        }
        if(nameOfTheFigure=="BlackPawn1"){
            list = pawn1.moving();
        }
        if(nameOfTheFigure=="BlackPawn2"){
            list = pawn2.moving();
        }
        if(nameOfTheFigure=="BlackPawn3"){
            list = pawn3.moving();
        }
        if(nameOfTheFigure=="BlackPawn4"){
            list = pawn4.moving();
        }
        if(nameOfTheFigure=="BlackPawn5"){
            list = pawn5.moving();
        }
        if(nameOfTheFigure=="BlackPawn6"){
            list = pawn6.moving();
        }
        if(nameOfTheFigure=="BlackPawn7"){
            list = pawn7.moving();
        }
        if(nameOfTheFigure=="BlackHorse1"){
            list = blackHorse1.moving();
        }
        if(nameOfTheFigure=="BlackHorse2"){
            list = blackHorse2.moving();
        }
        if(nameOfTheFigure=="BlackRook1"){
            list = blackRook1.moving();
        }
        if(nameOfTheFigure=="BlackRook2"){
            list = blackRook2.moving();
        }
        if(nameOfTheFigure=="BlackElephant1"){
            list = blackElephant1.moving();
        }
        if(nameOfTheFigure=="BlackElephant2"){
            list = blackElephant2.moving();
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




    }
public static Icon checkIcon(int a, int b){
        return chess[b][a].getIcon();
    }

}









