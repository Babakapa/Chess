package chess;



import javax.swing.Icon;


public class ChoosingRightFigure {
    private static final String k = "src\\Images\\";
    public static String chooseFigure(Icon icon){
String s = icon.toString();

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
            case k+"Horse1.png": return "BlackHorse1";
            case k+"Horse2.png": return "BlackHorse2";
            case k+"rook1.png": return "BlackRook1";
            case k+"rook2.png": return "BlackRook2";
            case k+"elephant1.png": return "BlackElephant1";
            case k+"elephant2.png": return "BlackElephant2";
            case k+"blackqueen.png": return "BlackQueen";
//white
            case k+"whiteking.png":return "WhiteKing";
            case k+"whitepawn.png": return "WhitePawn0";
            case k+"whitepawn1.png": return "WhitePawn1";
            case k+"whitepawn2.png": return "WhitePawn2";
            case k+"whitepawn3.png": return "WhitePawn3";
            case k+"whitepawn4.png": return "WhitePawn4";
            case k+"whitepawn5.png": return "WhitePawn5";
            case k+"whitepawn6.png": return "WhitePawn6";
            case k+"whitepawn7.png": return "WhitePawn7";
            case k+"whiteHorse.png": return "WhiteHorse1";
            case k+"whiteHorse1.png": return "WhiteHorse2";
            case k+"whiterook.png": return "WhiteRook1";
            case k+"whiterook2.png": return "WhiteRook2";
            case k+"whiteelephant.png": return "WhiteElephant1";
            case k+"whiteelephant1.png": return "WhiteElephant2";
            case k+"queenwhite.png": return "WhiteQueen";




default:return null;
        }



    }



public static boolean check(Icon icon) {
    String s = icon.toString();

    switch (s) {
        case k + "moderator_male-96.png":
        case k + "Pawn-icon0.png":
        case k + "Pawn-icon1.png":
        case k + "Pawn-icon2.png":
        case k + "Pawn-icon3.png":
        case k + "Pawn-icon4.png":
        case k + "Pawn-icon5.png":
        case k + "Pawn-icon6.png":
        case k + "Pawn-icon7.png":
        case k + "Horse1.png":
        case k + "Horse2.png":
        case k + "rook1.png":
        case k + "rook2.png":
        case k + "elephant1.png":
        case k + "elephant2.png":
        case k + "blackqueen.png":
            return false;
        default:
            return true;


    }
}








}
