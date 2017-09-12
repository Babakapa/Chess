package tetris;

import javax.swing.*;

/**
 * Created by Асус on 11.09.2017.
 */
public class ChoosingRightIcon {
    public static ImageIcon getIcon(String s){
        switch (s) {
            case "BlackKing":
                return new ImageIcon("src\\Images\\moderator_male-96.png");

                default:return null;
        }
    }


}
