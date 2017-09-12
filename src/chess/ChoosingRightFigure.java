package chess;



import javax.swing.Icon;


public class ChoosingRightFigure {

    public static String chooseFigure(Icon icon){
String s = icon.toString();
final String k = "src\\Images\\";
        switch (s){
            case k+"moderator_male-96.png":return "BlackKing";

default:return null;
        }

    }













}
