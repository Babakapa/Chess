package chess;

import javazoom.jl.player.Player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * Created by Асус on 11.10.2017.
 */
public class PlayMusic implements Runnable {
    private Player player;
   private String theNamesOfTheSongs;


    public PlayMusic(String songName) {
        theNamesOfTheSongs = songName;
    }
    @Override
    public void run() {
        try {
            BufferedInputStream buffer = new BufferedInputStream(
                    new FileInputStream("src\\Music\\" + theNamesOfTheSongs));
            player = new Player(buffer);
            player.play();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
