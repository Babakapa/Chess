package chess;



import javax.swing.Icon;


public class ChoosingRightFigure {

    public static String chooseFigure(Icon icon){
String s = icon.toString();
final String k = "src\\Images\\";
        switch (s){
            case k+"moderator_male-96.png":return "BlackKing";
            case k+"Pawn-icon0.png": return "BlackPawn0";
            case k+"Pawn-icon1.png": return "BlackPawn1";
            case k+"Pawn-icon2.png": return "BlackPawn2";
            case k+"Pawn-icon3.png": return "BlackPawn3";
            case k+"Pawn-icon4.png": return "BlackPawn4";
            case k+"Pawn-icon5.png": return "BlackPawn5";
            case k+"Pawn-icon6.png": return "BlackPawn6";
            case k+"Pawn-icon7.png": return "BlackPawn7";


default:return null;
        }

    }













}
