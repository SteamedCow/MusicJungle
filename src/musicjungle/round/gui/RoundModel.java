package musicjungle.round.gui;
import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JProgressBar;
import javazoom.jl.decoder.JavaLayerException;
import musicjungle.data.*;
import musicjungle.models.*;
import musicjungle.musicPlayer.MP3Player;

/**
 * RoundModel
 * @author SteamedCow
 * @version 17-12-2015
 */
public final class RoundModel implements Runnable
{
    private final RoundView view;
    private final MP3Player musicPlayer = new MP3Player();
    
    private int roundTime;
    private SongButton[] buttons;
    private JProgressBar timer;
    private SongButton correctButton;
    private Thread round;
    
    private long t0, dt;
    private boolean running = true;

    protected RoundModel(RoundView view) {
        this.view = view;
    }
    
    protected void startRound() {
        Player.round++;
        view.setRound(Player.round);
        timer.setValue(roundTime);
        setupSongs(getButtonCount());
        
        setCorrectButton(Utils.getRandomInteger(0, buttons.length - 1));
        
        running = true;
        round = new Thread(this);
        round.setDaemon(true);
        round.start();
    }
    
    private void setCorrectButton(int index) {
        final SongButton button = buttons[index];
        correctButton = button;
        correctButton.setCorrectAnswer(true);
    }
    
    protected void setRound(int buttonCount, int roundTime) {
        final int bc;
        if(buttonCount > GameData.MAX_SONG_BUTTON_COUNT)
            bc = GameData.MAX_SONG_BUTTON_COUNT;
        else if(buttonCount < GameData.MIN_SONG_BUTTON_COUNT)
            bc = GameData.MIN_SONG_BUTTON_COUNT;
        else
            bc = buttonCount;
        buttons = new SongButton[bc];
        setButtons(bc);
        
        if(roundTime > GameData.MAX_ROUND_TIME)
            this.roundTime = GameData.MAX_ROUND_TIME;
        else if(roundTime < GameData.MIN_ROUND_TIME) {
            if(roundTime == -1)
                this.roundTime = -1;
            else
                this.roundTime = GameData.MIN_ROUND_TIME;
        }
        else
            this.roundTime = roundTime;
        
        timer = view.getTimer();
        timer.setMaximum(this.roundTime);
    }
    
    private void setButtons(int buttonCount) {
        SongButton button;
        for (int i = 0; i < buttonCount; i++) {
            button = new SongButton();
            button.addActionListener(new SongButtonListener());
            button.setFont(GUIData.SONGBUTTON_FONT);
            button.setForeground(GUIData.SONGBUTTON_TEXT_COLOR);
            
            view.addButton(button);
            buttons[i] = button;
        }
    }
    
    private void setupSongs(int buttonCount) {
        final ArrayList<Song> randomSongs = GameData.getRandomSongs(buttonCount, -1);
        
        SongButton button;
        Song song;
        for (int i = 0; i < buttonCount; i++) {
            button = buttons[i];
            song = randomSongs.get(i);
            
            button.setBackground(null);
            button.setCorrectAnswer(false);
            button.setSong(song);
            button.setText(song.artist + " - " + song.title);
            button.setEnabled(true);
        }
    }
    
    protected int getButtonCount() {
        return buttons.length;
    }

    @Override
    public void run() {
        try {
            timer.setForeground(Color.green);
            
            long t;
            final Song song = correctButton.getSong();
            final int midway = roundTime / 3;
            final int warning = midway * 2;
            
            musicPlayer.play(song, Utils.getRandomInteger(10, song.duration - 10 - GameData.ROUND_TIME));
            t0 = System.currentTimeMillis();
            
            while(running) {
                t = System.currentTimeMillis();
                dt = t - t0;
                
                timer.setValue((int) (roundTime - dt));
                if(dt > warning)
                    timer.setForeground(Color.red);
                else if(dt > midway)
                    timer.setForeground(Color.yellow);
                
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) { }
                
                if(dt > roundTime)
                    running = false;
            }
            
            musicPlayer.stop();
        } catch (JavaLayerException | IOException ex) {
            ex.printStackTrace();
        }
    }

    void stopRound() {
        running = false;
        for (SongButton button : buttons) {
            button.setEnabled(false);
        }
    }

    void guess(SongButton button) {
        final boolean isCorrect = button.isCorrectAnswer();
        
        try {
            new MP3Player().playGuessSFX(isCorrect);
        } catch (JavaLayerException ex) {
            ex.printStackTrace();
        }
        
        if (isCorrect) {
            final int score = (int) (100.0 * timer.getValue() / timer.getMaximum());
            
            Player.score += score + 1;
            view.setScore(Player.score);
        }
        else
            button.setBackground(Color.red);
        
        correctButton.setBackground(Color.green);
    }
}