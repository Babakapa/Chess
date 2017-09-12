package chess;

import javax.swing.*;

public class Main {
private static final int HEIGHT = 500;
private static final int WIDTH = 500;

    public static void main(String[] args) {
Board b = new Board();
b.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
b.setSize(WIDTH,HEIGHT);
b.setLocationRelativeTo(null);
b.setVisible(true);






    }
}
