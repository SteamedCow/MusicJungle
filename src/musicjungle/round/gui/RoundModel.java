package musicjungle.round.gui;
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
    private Song correctSong;
    
    private long t0;
    private boolean running = true;

    protected RoundModel(RoundView view) {
        this.view = view;
    }
    
    protected void startRound() {
        setCorrectButton(Utils.getRandomInteger(0, buttons.length - 1));
        
        Thread round = new Thread(this);
        round.setDaemon(true);
        t0 = System.currentTimeMillis();
        round.start();
    }
    
    private void setCorrectButton(int index) {
        final SongButton correctButton = buttons[index];
        correctSong = correctButton.getSong();
        correctButton.setCorrectAnswer(true);
        System.out.println("Correct song: " + correctSong.toSimpleString());
    }
    
    protected void newRound(int buttonCount, int roundTime) {
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
        
        view.setRound(Player.round);
        timer.setValue(roundTime);
    }
    
    private void setButtons(int buttonCount) {
        SongButton button;
        for (int i = 0; i < buttonCount; i++) {
            button = new SongButton();
            button.addActionListener(new SongButtonListener());
            
            view.addButton(button);
            buttons[i] = button;
        }
        setupSongs(buttonCount);
    }
    
    private void setupSongs(int buttonCount) {
        final ArrayList<Song> randomSongs = GameData.getRandomSongs(buttonCount, -1);
        
        SongButton button;
        Song song;
        for (int i = 0; i < buttonCount; i++) {
            button = buttons[i];
            song = randomSongs.get(i);
            
            button.setSong(song);
            button.setText(song.artist + " - " + song.title);
        }
    }
    
    protected int getButtonCount() {
        return buttons.length;
    }

    @Override
    public void run() {
        try {
            long t, dt;
            musicPlayer.play(correctSong, Utils.getRandomInteger(10, correctSong.duration - 10 - GameData.ROUND_TIME));
            
            while(running) {
                t = System.currentTimeMillis();
                dt = t - t0;
                
                timer.setValue((int) (roundTime - dt));
                
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
}