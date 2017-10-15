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
private static Music music;
private Player player;
private JButton stop = new JButton("Stop");
private JPanel panel = new JPanel();
private JPanel panelForPause = new JPanel();
private boolean bp = true;
    private Music() {

setLayout(new BorderLayout());
        createGUI();
        add(panel,BorderLayout.CENTER);
        add(panelForPause, BorderLayout.SOUTH);


    }

    private void createGUI() {
        panel.setLayout(new GridLayout(theNamesOfTheSongs.length, 0));
        panelForPause.setLayout(new FlowLayout());
        for (int i = 0; i < theNamesOfTheSongs.length; i++) {
            fileSongs[i] = new File("src\\Music\\" + theNamesOfTheSongs[i]);
            if(theNamesOfTheSongs[i].length() > 50){
                while (makingShortName(i) > 50){
                    makingShortName(i);
                }

            }
            songs[i] = new JButton(theNamesOfTheSongs[i]);
            songs[i].setFont(new Font("Arial", Font.BOLD, 20));



            songs[i].addActionListener(this);

            panel.add(songs[i]);
        }
        stop.setFont(new Font("Arial",Font.BOLD,15));
        panelForPause.add(stop);
stop.addActionListener(this);
    }

    private int makingShortName(int i) {
        File file = new File("src\\Music\\" + theNamesOfTheSongs[i]);

       String s = JOptionPane.showInputDialog("Your previous name is: " + theNamesOfTheSongs[i]);
       if(!s.equals("null")){
           theNamesOfTheSongs[i] = s+".mp3";
       }
        File newFile = new File("src\\Music\\" + theNamesOfTheSongs[i]);
        if(file.renameTo(newFile)){
            JOptionPane.showMessageDialog(null,"Rename was completed");
        }
        else{
            JOptionPane.showMessageDialog(null,"Can't rename the file");
        }
return theNamesOfTheSongs[i].length();
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
        if(e.getSource()==stop){
t.close();
        }
        for (int i = 0; i < theNamesOfTheSongs.length; i++)

if(e.getSource()==songs[i]) {
            if(t!=null &&t.isAlive()){
                t.close();
            }
    t = new thread();

        t.s = theNamesOfTheSongs[i];
        t.start();


    break;
    }

    }
private class thread extends Thread{
        private int currentTime = 0;
        private String s;
        private boolean paused = false;
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

