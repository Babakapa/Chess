package chess;



/**
 * Created by Асус on 24.09.2017.
 */
public class GetTurn {

    public boolean getTurn(boolean bp, String s){
        if(bp){
            return checkWhiteFigure(s);
        }
        else{
            return checkBlackFigure(s);
        }


    }

    private boolean checkBlackFigure(String s) {
       switch (s) {
           case "BlackKing":

           case "BlackPawn0":
           case "BlackPawn1":
           case "BlackPawn2":
           case "BlackPawn3":
           case "BlackPawn4":
           case "BlackPawn5":
           case "BlackPawn6":
           case "BlackPawn7":
           case "BlackHorse1":
           case "BlackHorse2":
           case "BlackRook1":
           case "BlackRook2":
           case "BlackElephant1":
           case "BlackElephant2":
           case "BlackQueen":return true;
           default:
               return false;
       }

    }

    private boolean checkWhiteFigure(String s) {
        switch (s) {
            case "WhitePawn0":

            case "WhitePawn1":

            case "WhitePawn2":

            case "WhitePawn3":

            case "WhitePawn4":

            case "WhitePawn5":

            case "WhitePawn6":

            case "WhitePawn7":

            case "WhiteHorse1":

            case "WhiteHorse2":

            case "WhiteRook1":

            case "WhiteRook2":

            case "WhiteQueen":

            case "WhiteKing":

            case "WhiteElephant1":

            case "WhiteElephant2":
                return true;
            default:
                return false;
        }
    }
}
