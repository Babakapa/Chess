package chess;



import javax.swing.Icon;


public class ChoosingRightFigure {
    private static final String k = "src\\Images\\";




public static boolean check(Icon icon) {
    final String s = icon.toString();

    switch (s) {
        case k + "moderator_male-96.png":
        case k + "Pawn-icon0.png":
        case k + "Horse1.png":
        case k + "rook1.png":
        case k + "elephant1.png":
        case k + "blackqueen.png":
            return false;
        default:
            return true;


    }
}








}
