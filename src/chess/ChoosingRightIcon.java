package chess;

import javax.swing.*;


public class ChoosingRightIcon {
    public static ImageIcon getIcon(String s){
        switch (s) {
            case "BlackKing":
                return new ImageIcon("src\\Images\\moderator_male-96.png");
            case "BlackPawn0":
                return new ImageIcon("src\\Images\\Pawn-icon0.png");
            case "BlackPawn1":
                return new ImageIcon("src\\Images\\Pawn-icon1.png");
            case "BlackPawn2":
                return new ImageIcon("src\\Images\\Pawn-icon2.png");
            case "BlackPawn3":
                return new ImageIcon("src\\Images\\Pawn-icon3.png");
            case "BlackPawn4":
                return new ImageIcon("src\\Images\\Pawn-icon4.png");
            case "BlackPawn5":
                return new ImageIcon("src\\Images\\Pawn-icon5.png");
            case "BlackPawn6":
                return new ImageIcon("src\\Images\\Pawn-icon6.png");
            case "BlackPawn7":
                return new ImageIcon("src\\Images\\Pawn-icon7.png");
            case "BlackHorse1":
                return new ImageIcon("src\\Images\\Horse1.png");
            case "BlackHorse2":
                return new ImageIcon("src\\Images\\Horse2.png");
            case "BlackRock1":
                return new ImageIcon("src\\Images\\rock1.png");
            case "BlckRock2":
                return new ImageIcon("src\\Images\\rock2.png");



                default:return null;
        }
    }


}
