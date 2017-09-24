package chess;

import javax.swing.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public abstract class Chess extends JFrame{
    protected King king = new King(4,0);
    protected Pawn pawn0 = new Pawn(0,1);
    protected Pawn pawn1 = new Pawn(1,1);



    protected Pawn pawn2 = new Pawn(2,1);
    protected Pawn pawn3 = new Pawn(3,1);
    protected Pawn pawn4 = new Pawn(4,1);
    protected Pawn pawn5 = new Pawn(5,1);
    protected Pawn pawn6 = new Pawn(6,1);
    protected Pawn pawn7 = new Pawn(7,1);


    protected Horse blackHorse1 = new Horse(1,0);
    protected Horse blackHorse2 = new Horse(6,0);

    protected Rook blackRook1 = new Rook(0,0);
    protected Rook blackRook2 = new Rook(7,0);

    protected Elephant blackElephant1 = new Elephant(2,0);
    protected Elephant blackElephant2 = new Elephant(5,0);

    protected Queen blackQueen = new Queen(3,0);


    protected King whiteking = new King(4,7);
    protected Queen whiteQueen = new Queen(3,7);
    protected WhitePawn whitepawn0 = new WhitePawn(0,6);
    protected WhitePawn whitepawn1 = new WhitePawn(1,6);
    protected WhitePawn whitepawn2 = new WhitePawn(2,6);
    protected WhitePawn whitepawn3 = new WhitePawn(3,6);
    protected WhitePawn whitepawn4 = new WhitePawn(4,6);
    protected WhitePawn whitepawn5 = new WhitePawn(5,6);
    protected WhitePawn whitepawn6 = new WhitePawn(6,6);
    protected WhitePawn whitepawn7 = new WhitePawn(7,6);


    protected Horse whiteHorse1 = new Horse(1,7);
    protected Horse whiteHorse2 = new Horse(6,7);

    protected Rook whiteRook1 = new Rook(0,7);
    protected Rook whiteRook2 = new Rook(7,7);

    protected Elephant whiteElephant1 = new Elephant(2,7);
    protected Elephant whiteElephant2 = new Elephant(5,7);

    protected LinkedList<LinkedList<Integer>> list= new LinkedList<>();

    protected Map<Object,LinkedList> whiteStrokes = new HashMap<>();
    protected Map<Object,LinkedList> blackStrokes = new HashMap<>();
protected void makeStrokes(){
    whiteStrokes.put(whitepawn0, whitepawn0.moving(true));
    whiteStrokes.put(whitepawn1, whitepawn1.moving(true));
    whiteStrokes.put(whitepawn2, whitepawn2.moving(true));
    whiteStrokes.put(whitepawn3, whitepawn3.moving(true));
    whiteStrokes.put(whitepawn4, whitepawn4.moving(true));
    whiteStrokes.put(whitepawn5, whitepawn5.moving(true));
    whiteStrokes.put(whitepawn6, whitepawn6.moving(true));
    whiteStrokes.put(whitepawn7, whitepawn7.moving(true));
    whiteStrokes.put(whiteking, whiteking.moving(true));
    whiteStrokes.put(whiteElephant1, whiteElephant1.moving(true));
    whiteStrokes.put(whiteElephant2, whiteElephant2.moving(true));
    whiteStrokes.put(whiteHorse1, whiteHorse1.moving(true));
    whiteStrokes.put(whiteHorse2, whiteHorse2.moving(true));
    whiteStrokes.put(whiteRook1, whiteRook1.moving(true));
    whiteStrokes.put(whiteRook2, whiteRook2.moving(true));
    whiteStrokes.put(whiteQueen, whiteQueen.moving(true));

    //Black
    blackStrokes.put(pawn0, pawn0.moving(true));
    blackStrokes.put(pawn1, pawn1.moving(true));
    blackStrokes.put(pawn2, pawn2.moving(true));
    blackStrokes.put(pawn3, pawn3.moving(true));
    blackStrokes.put(pawn4, pawn4.moving(true));
    blackStrokes.put(pawn5, pawn5.moving(true));
    blackStrokes.put(pawn6, pawn6.moving(true));
    blackStrokes.put(pawn7, pawn7.moving(true));
    blackStrokes.put(blackElephant1, blackElephant1.moving(true));
    blackStrokes.put(blackElephant2, blackElephant2.moving(true));
    blackStrokes.put(blackHorse1, blackHorse1.moving(true));
    blackStrokes.put(blackHorse2, blackHorse2.moving(true));
    blackStrokes.put(blackRook1, blackRook1.moving(true));
    blackStrokes.put(blackRook2, blackRook2.moving(true));
    blackStrokes.put(blackQueen, blackQueen.moving(true));
    blackStrokes.put(king, king.moving(true));
}
protected boolean whiteKingIsUnderAttack = false;
protected boolean blackKingIsunderAttack = false;


}
