package chess;

import javax.swing.*;


public class ChoosingRightIcon {
    public static ImageIcon getIcon(String s){
        switch (s) {
            case "BlackKing":
                return new ImageIcon("src\\Images\\moderator_male-96.png");
                default:return null;
        }
    }


}
