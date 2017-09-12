package tetris;



import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;


public class Board extends JFrame{
private JButton [][] chess  = new JButton[8][8];
private King king = new King(4,0);
private String nameOfTheFigure;
protected LinkedList<LinkedList<Integer>> list= new LinkedList<>();
  private LinkedList<Color> tempList = new LinkedList<>();

private int i = 0;
private int j = 0;
private int tempX;
private int tempY;
int k = 0;
private Object object = new Object();
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
        nameOfTheFigure = ChoosingRightFigure.chooseFigure(chess[a][b].getIcon());
        processing();

    }else if(chess[a][b].getBackground()!=Color.blue)
       clearPossibleVariants();
else{

    System.out.print(nameOfTheFigure);
    chess[a][b].setIcon(ChoosingRightIcon.getIcon(nameOfTheFigure));


clearPossibleVariants();
    }



}


}

    private void clearPossibleVariants() {
        for(int i = 0;i<list.get(0).size();i++){
            chess[list.get(1).get(i)][list.get(0).get(i)].setBackground(tempList.get(i));
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


    }

    private void processing() {
        if(nameOfTheFigure=="BlackKing")
list = king.moving();



showPossibleVariants();


    }

    private void showPossibleVariants() {
for(int i = 0;i<list.get(0).size();i++){
tempList.add(chess[list.get(1).get(i)][list.get(0).get(i)].getBackground());
chess[list.get(1).get(i)][list.get(0).get(i)].setBackground(Color.blue);
    }




    }


}









