package chess;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.WindowConstants;
/**
 * Created by Асус on 09.10.2017.
 */
public class ChooseYourFigure {
    private JFrame frame = new JFrame();
    private JButton buttonForQueen = new JButton("Queen");
    private JButton buttonForElephant = new JButton("Elephant");
    private JButton buttonForRock = new JButton("Rock");
    private JButton buttonForHorse = new JButton("Horse");
    private ChessPropreties nameOfTheFigure;
    private int x;
private int y;
    public ChooseYourFigure(ChessPropreties nameOfTheFigure, int x, int y){
        this.nameOfTheFigure = nameOfTheFigure;
        this.x = x;
        this.y = y;
frame.setLayout(new GridLayout(4,0));
frame.setLocationRelativeTo(null);
frame.setSize(400,500);
frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
setTheButtons();
frame.setVisible(true);
    }
    private void setTheButtons(){
frame.add(buttonForQueen);
frame.add(buttonForElephant);
frame.add(buttonForHorse);
frame.add(buttonForRock);
buttonForQueen.addActionListener(new Listener());
buttonForQueen.setFont(new Font("Arial",Font.BOLD,40));
buttonForElephant.addActionListener(new Listener());
        buttonForElephant.setFont(new Font("Arial",Font.BOLD,40));
buttonForHorse.addActionListener(new Listener());
        buttonForHorse.setFont(new Font("Arial",Font.BOLD,40));
buttonForRock.addActionListener(new Listener());
        buttonForRock.setFont(new Font("Arial",Font.BOLD,40));
    }



    private class Listener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource()==buttonForElephant){
               setElephant();
               frame.dispose();
           }
if(e.getSource()==buttonForHorse){
               setHorse();
    frame.dispose();
}
if(e.getSource()==buttonForQueen){
    setQueen();
    frame.dispose();
}
            if(e.getSource()==buttonForRock){
                setRock();
                frame.dispose();
            }

        }




    }

    private void setRock() {
        if(nameOfTheFigure.getClass()==WhitePawn.class)
            Chess.createRock(x,y, true);
        else
            Chess.createRock(x,y,false);
    }

    private void setQueen() {
        if(nameOfTheFigure.getClass()==WhitePawn.class)
            Chess.createQueen(x,y, true);
        else
            Chess.createQueen(x,y,false);
    }

    private void setHorse() {
        if(nameOfTheFigure.getClass()==WhitePawn.class)
        Chess.createHorse(x,y, true);
    else
        Chess.createHorse(x,y,false);

    }

    private void setElephant() {
        if(nameOfTheFigure.getClass()==WhitePawn.class)
        Chess.createElephant(x,y, true);
        else
            Chess.createElephant(x,y,false);
    }

}
