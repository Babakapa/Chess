package chess;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.*;
/**
 * Created by Асус on 09.10.2017.
 */
public class Music extends JPanel implements ActionListener {
    private File file = new File("src\\Music\\");
    private String[] theNamesOfTheSongs = file.list();
    private JButton[] songs = new JButton[theNamesOfTheSongs.length];
    private File fileSongs[] = new File[theNamesOfTheSongs.length];
    private PlayMusic playMusic;
private static Music music;
private Player player;

private boolean bp = false;
    private Music() {
        setLayout(new GridLayout(theNamesOfTheSongs.length, 0));
        for (int i = 0; i < theNamesOfTheSongs.length; i++) {
            songs[i] = new JButton(theNamesOfTheSongs[i]);
            songs[i].setFont(new Font("Arial", Font.BOLD, 20));
            fileSongs[i] = new File("src\\Music\\" + theNamesOfTheSongs[i]);
            songs[i].addActionListener(this);
            add(songs[i]);
        }

    }

    public static Music getInstance(){
        if(music==null){
            music = new Music();
        }
        return music;

    }
    thread t;
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < theNamesOfTheSongs.length; i++)
if(e.getSource()==songs[i]) {
            if(t!=null &&t.isAlive()  ){
                t.close();
                t.interrupt();

            }
    t = new thread();

        t.s = theNamesOfTheSongs[i];
        t.start();


    break;
    }

    }
private class thread extends Thread{
        private String s;
        private void play() throws JavaLayerException, FileNotFoundException {
            BufferedInputStream buffer = new BufferedInputStream(
                    new FileInputStream("src\\Music\\" + s));
            player = new Player(buffer);
            player.play();

        }
        @Override
        public void run(){
            try {
                play();
            } catch (JavaLayerException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }


    private void close() {
            player.close();
    }
}



}

