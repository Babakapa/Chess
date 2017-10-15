package chess;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;


public abstract class Chess extends JFrame{
    protected static JButton [][] chess  = new JButton[8][8];
    protected static King king = new King(4,0);
    protected static Pawn pawn0 = new Pawn(0,1);
    protected static Pawn pawn1 = new Pawn(1,1);

    protected static Pawn pawn2 = new Pawn(2,1);
    protected static Pawn pawn3 = new Pawn(3,1);
    protected static Pawn pawn4 = new Pawn(4,1);
    protected static Pawn pawn5 = new Pawn(5,1);
    protected static Pawn pawn6 = new Pawn(6,1);
    protected static Pawn pawn7 = new Pawn(7,1);


    protected static Horse blackHorse1 = new Horse(1,0);
    protected static Horse blackHorse2 = new Horse(6,0);

    protected static Rook blackRook1 = new Rook(0,0);
    protected static Rook blackRook2 = new Rook(7,0);

    protected static Elephant blackElephant1 = new Elephant(2,0);
    protected static Elephant blackElephant2 = new Elephant(5,0);

    protected static Queen blackQueen = new Queen(3,0);


    protected static King whiteking = new King(4,7);
    protected static Queen whiteQueen = new Queen(3,7);
    protected static WhitePawn whitepawn0 = new WhitePawn(0,6);
    protected static WhitePawn whitepawn1 = new WhitePawn(1,6);
    protected static WhitePawn whitepawn2 = new WhitePawn(2,6);
    protected static WhitePawn whitepawn3 = new WhitePawn(3,6);
    protected static WhitePawn whitepawn4 = new WhitePawn(4,6);
    protected static WhitePawn whitepawn5 = new WhitePawn(5,6);
    protected static WhitePawn whitepawn6 = new WhitePawn(6,6);
    protected static WhitePawn whitepawn7 = new WhitePawn(7,6);


    protected static Horse whiteHorse1 = new Horse(1,7);
    protected static Horse whiteHorse2 = new Horse(6,7);

    protected static Rook whiteRook1 = new Rook(0,7);
    protected static Rook whiteRook2 = new Rook(7,7);

    protected static Elephant whiteElephant1 = new Elephant(2,7);
    protected static Elephant whiteElephant2 = new Elephant(5,7);

    protected LinkedList<LinkedList<Integer>> list= new LinkedList<>();

    public static King getKing() {
        return king;
    }

    public static King getWhiteking() {
        return whiteking;
    }

    protected static boolean whiteKingIsUnderAttack = false;
protected static boolean blackKingIsunderAttack = false;


    public static void setWhiteKingIsUnderAttack(boolean whiteKingIsUnderAttack) {
        Chess.whiteKingIsUnderAttack = whiteKingIsUnderAttack;
    }

    public static void setBlackKingIsunderAttack(boolean blackKingIsunderAttack) {
        Chess.blackKingIsunderAttack = blackKingIsunderAttack;
    }

    protected static boolean white = true;
protected static ChessPropreties gettingRightWhiteObject(int x, int y) {

    if (x == whitepawn0.getX() && y == whitepawn0.getY())
        return whitepawn0;
    if (x == whitepawn1.getX() && y == whitepawn1.getY())
        return whitepawn1;
    if (x == whitepawn2.getX() && y == whitepawn2.getY())
        return whitepawn2;
    if (x == whitepawn3.getX() && y == whitepawn2.getY())
        return whitepawn3;
    if (x == whitepawn3.getX() && y == whitepawn3.getY())
        return whitepawn3;
    if (x == whitepawn4.getX() && y == whitepawn4.getY())
        return whitepawn4;
    if (x == whitepawn5.getX() && y == whitepawn5.getY())
        return whitepawn5;
    if (x == whitepawn6.getX() && y == whitepawn6.getY())
        return whitepawn6;
    if (x == whitepawn7.getX() && y == whitepawn7.getY())
        return whitepawn7;
    if (x == whiteElephant1.getX() && y == whiteElephant1.getY())
        return whiteElephant1;
    if (x == whiteElephant2.getX() && y == whiteElephant2.getY())
        return whiteElephant2;
    if (x == whiteHorse2.getX() && y == whiteHorse2.getY())
        return whiteHorse2;
    if (x == whiteHorse1.getX() && y == whiteHorse1.getY())
        return whiteHorse1;
    if (x == whiteQueen.getX() && y == whiteQueen.getY())
        return whiteQueen;
    if (x == whiteRook1.getX() && y == whiteRook1.getY())
        return whiteRook1;
    if (x == whiteRook2.getX() && y == whiteRook2.getY())
        return whiteRook2;
    if (x == whiteking.getX() && y == whiteking.getY())
        return whiteking;
    for(ChessPropreties ch:addingWhiteFigures){
        if(ch.getX()==x && y == ch.getY()){
            return ch;
        }
    }
    return null;
}

    protected static ArrayList<ChessPropreties> addingWhiteFigures = new ArrayList<>();
    protected static ArrayList<ChessPropreties> addingBlackFigures = new ArrayList<>();

    public static ChessPropreties gettingRightBlackObject(int x, int y){

    if (x == pawn0.getX() && y == pawn0.getY())
        return pawn0;
    if (x == pawn1.getX() && y == pawn1.getY())
        return pawn1;
    if (x == pawn2.getX() && y == pawn2.getY())
        return pawn2;
    if (x == pawn3.getX() && y == pawn3.getY())
        return pawn3;
    if (x == pawn4.getX() && y == pawn4.getY())
        return pawn4;
    if (x == pawn5.getX() && y == pawn5.getY())
        return pawn5;
    if (x == pawn6.getX() && y == pawn6.getY())
        return pawn6;
    if (x == pawn7.getX() && y == pawn7.getY())
        return pawn7;
    if (x == blackRook2.getX() && y == blackRook2.getY())
        return blackRook2;
    if (x == blackRook1.getX() && y == blackRook1.getY())
        return blackRook1;
    if (x == blackQueen.getX() && y == blackQueen.getY())
        return blackQueen;
    if (x == blackElephant2.getX() && y == blackElephant2.getY())
        return blackElephant2;
    if (x == blackElephant1.getX() && y == blackElephant1.getY())
        return blackElephant1;
    if (x == blackHorse1.getX() && y == blackHorse1.getY())
        return blackHorse1;
    if (x == blackHorse2.getX() && y == blackHorse2.getY())
        return blackHorse2;
    if (x == king.getX() && y == king.getY())
        return king;
    for(ChessPropreties ch:addingBlackFigures){
        if(ch.getX()==x && y == ch.getY()){
            return ch;
        }
    }
    return null;
}

protected void updateWhiteStrokes(){
    for(ChessPropreties ch:addingWhiteFigures){
       ch.checkForBorders(true);
    }
        whitepawn0.checkForBorders(true);
        whitepawn1.checkForBorders(true);
        whitepawn2.checkForBorders(true);
        whitepawn3.checkForBorders(true);
        whitepawn4.checkForBorders(true);
        whitepawn5.checkForBorders(true);
        whitepawn6.checkForBorders(true);
        whitepawn7.checkForBorders(true);
        whiteking.checkForBorders(true);
        whiteQueen.checkForBorders(true);
        whiteHorse1.checkForBorders(true);
        whiteHorse2.checkForBorders(true);
        whiteElephant1.checkForBorders(true);
        whiteElephant2.checkForBorders(true);
        whiteRook1.checkForBorders(true);
        whiteRook2.checkForBorders(true);

}



protected void updateBlackStrokes(){
    for(ChessPropreties ch:addingBlackFigures){
        ch.checkForBorders(false);
    }
        pawn0.checkForBorders(false);

        pawn1.checkForBorders(false);

        pawn2.checkForBorders(false);
        pawn3.checkForBorders(false);
        pawn4.checkForBorders(false);
        pawn5.checkForBorders(false);
        pawn6.checkForBorders(false);
        pawn7.checkForBorders(false);
        king.checkForBorders(false);
        blackQueen.checkForBorders(false);
        blackHorse1.checkForBorders(false);
        blackHorse2.checkForBorders(false);
        blackElephant1.checkForBorders(false);
        blackElephant2.checkForBorders(false);
        blackRook1.checkForBorders(false);
        blackRook2.checkForBorders(false);

    }

public static boolean checkForAttack(int x, int y, boolean white){
    if(white) {

        if (pawn0.getX() == x && pawn0.getY() == y)
            return true;
        if (pawn1.getX() == x && pawn1.getY() == y )
            return true;
        if (pawn2.getX() == x && pawn2.getY() == y )
            return true;
        if (pawn3.getX() == x && pawn3.getY() == y )
            return true;
        if (pawn4.getX() == x && pawn4.getY() == y )
            return true;
        if (pawn5.getX() == x && pawn5.getY() == y )
            return true;
        if (pawn6.getX() == x && pawn6.getY() == y)
            return true;
        if (pawn7.getX() == x && pawn7.getY() == y)
            return true;
        if (blackRook1.getX() == x && blackRook1.getY()==y)
            return true;
        if (blackRook2.getX() == x && blackRook2.getY()==y)
            return true;
        if (blackHorse1.getX() == x && blackHorse1.getY() == y )
            return true;
        if (blackHorse2.getX() == x && blackHorse2.getY() == y )
            return true;
        if (king.getX() == x && king.getY() == y )
            return true;
        if (blackQueen.getX() == x && blackQueen.getY() == y )
            return true;
        if (blackElephant1.getX() == x && blackElephant1.getY() == y )
            return true;
        if (blackElephant2.getX() == x && blackElephant2.getY() == y)
            return true;
        for(ChessPropreties ch:addingBlackFigures){
           if(ch.getX()==x && ch.getY()==y){
               return true;
           }
        }
    }
    else if(!white){
        if (whitepawn0.getX() == x && whitepawn0.getY() == y )
            return true;
        if (whitepawn1.getX() == x && whitepawn1.getY() == y )
            return true;
        if (whitepawn2.getX() == x && whitepawn2.getY() == y )
            return true;
        if (whitepawn3.getX() == x && whitepawn3.getY() == y )
            return true;
        if (whitepawn4.getX() == x && whitepawn4.getY() == y )
            return true;
        if (whitepawn5.getX() == x && whitepawn5.getY() == y )
            return true;
        if (whitepawn6.getX() == x && whitepawn6.getY() == y )
            return true;
        if (whitepawn7.getX() == x && whitepawn7.getY() == y )
            return true;
        if (whiteRook1.getX() == x && whiteRook1.getY() == y )
            return true;
        if (whiteRook2.getX() == x && whiteRook2.getY() == y )
            return true;
        if (whiteHorse1.getX() == x && whiteHorse1.getY() == y )
            return true;
        if (whiteHorse2.getX() == x && whiteHorse2.getY() == y )
            return true;
        if (whiteking.getX() == x && whiteking.getY() == y )
            return true;
        if (whiteQueen.getX() == x && whiteQueen.getY() == y )
            return true;
        if (whiteElephant1.getX() == x && whiteElephant1.getY() == y )
            return true;
        if (whiteElephant2.getX() == x && whiteElephant2.getY() == y )
            return true;
        for(ChessPropreties ch:addingWhiteFigures){
            if(ch.getX()==x && ch.getY()==y){
                return true;
            }
        }
    }
    return false;
}

    public static boolean checkForCorrectness(int x, int y) {
        for(ChessPropreties ch:addingBlackFigures){
            if(ch.getX()==x && ch.getY()==y){
                return true;
            }
        } for(ChessPropreties ch:addingWhiteFigures){
            if(ch.getX()==x && ch.getY()==y){
                return true;
            }
        }

            if (pawn0.getX() == x && pawn0.getY() == y)
                return true;
            if (pawn1.getX() == x && pawn1.getY() == y )
                return true;
            if (pawn2.getX() == x && pawn2.getY() == y )
                return true;
            if (pawn3.getX() == x && pawn3.getY() == y )
                return true;
            if (pawn4.getX() == x && pawn4.getY() == y )
                return true;
            if (pawn5.getX() == x && pawn5.getY() == y )
                return true;
            if (pawn6.getX() == x && pawn6.getY() == y)
                return true;
            if (pawn7.getX() == x && pawn7.getY() == y)
                return true;
            if (blackRook1.getX() == x && blackRook1.getY()==y)
                return true;
            if (blackRook2.getX() == x && blackRook2.getY()==y)
                return true;
            if (blackHorse1.getX() == x && blackHorse1.getY() == y )
                return true;
            if (blackHorse2.getX() == x && blackHorse2.getY() == y )
                return true;
            if (king.getX() == x && king.getY() == y )
                return true;

            if (blackQueen.getX() == x && blackQueen.getY() == y )
                return true;
            if (blackElephant1.getX() == x && blackElephant1.getY() == y )
                return true;
            if (blackElephant2.getX() == x && blackElephant2.getY() == y)
                return true;


            if (whitepawn0.getX() == x && whitepawn0.getY() == y )
                return true;
            if (whitepawn1.getX() == x && whitepawn1.getY() == y )
                return true;
            if (whitepawn2.getX() == x && whitepawn2.getY() == y )
                return true;
            if (whitepawn3.getX() == x && whitepawn3.getY() == y )
                return true;
            if (whitepawn4.getX() == x && whitepawn4.getY() == y )
                return true;
            if (whitepawn5.getX() == x && whitepawn5.getY() == y )
                return true;
            if (whitepawn6.getX() == x && whitepawn6.getY() == y )
                return true;
            if (whitepawn7.getX() == x && whitepawn7.getY() == y )
                return true;
            if (whiteRook1.getX() == x && whiteRook1.getY() == y )
                return true;
            if (whiteRook2.getX() == x && whiteRook2.getY() == y )
                return true;
            if (whiteHorse1.getX() == x && whiteHorse1.getY() == y )
                return true;
            if (whiteHorse2.getX() == x && whiteHorse2.getY() == y )
                return true;
            if (whiteking.getX() == x && whiteking.getY() == y )
                return true;
            if (whiteQueen.getX() == x && whiteQueen.getY() == y )
                return true;
            if (whiteElephant1.getX() == x && whiteElephant1.getY() == y )
                return true;
            if (whiteElephant2.getX() == x && whiteElephant2.getY() == y )
                return true;

    return false;

    }
    public static void createElephant(int x, int y, boolean bp){
    if(bp) {
        addingWhiteFigures.add(new Elephant(x, y));
        chess[y][x].setIcon(new ImageIcon("src\\Images\\whiteelephant.png"));
    }
    else {
        addingBlackFigures.add(new Elephant(x,y));
        chess[y][x].setIcon(new ImageIcon("src\\Images\\elephant1.png"));
    }
    }
    public static void createQueen(int x, int y, boolean bp){
        if(bp)
        {
            addingWhiteFigures.add(new Queen(x,y));
            chess[y][x].setIcon(new ImageIcon("src\\Images\\queenwhite.png"));
        }
        else {
            addingBlackFigures.add(new Queen(x,y));
            chess[y][x].setIcon(new ImageIcon("src\\Images\\blackqueen.png"));
        }
    }
    public static void createRock(int x, int y, boolean bp){
        if(bp) {
            addingWhiteFigures.add(new Rook(x, y));
            chess[y][x].setIcon(new ImageIcon("src\\Images\\whiterook.png"));
        }
        else {
            addingBlackFigures.add(new Rook(x,y));
            chess[y][x].setIcon(new ImageIcon("src\\Images\\rook1.png"));
        }
    }
    public static void createHorse(int x, int y, boolean bp){
        if(bp) {
            addingWhiteFigures.add(new Horse(x, y));
            chess[y][x].setIcon(new ImageIcon("src\\Images\\whiteHorse.png"));
        }
        else {
            addingBlackFigures.add(new Horse(x,y));
            chess[y][x].setIcon(new ImageIcon("src\\Images\\Horse1.png"));
        }
    }
}
