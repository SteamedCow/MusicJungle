package musicjungle.musicPlayer;
import java.io.*;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import musicjungle.models.Song;

/**
 * MP3Player
 * @author SteamedCow
 * @version 23-12-2015
 */
public class MP3Player implements Runnable
{
    private Player player;
    
    public void play(Song song, int startTime) throws JavaLayerException, IOException {
        final FileInputStream fis = new FileInputStream(song.filepath);
        final BufferedInputStream bis = new BufferedInputStream(fis);
        final int skipBytes = song.bitRate / 8 * 1000 * startTime;
        bis.skip(skipBytes);
        start(bis);
        
        Thread playMusic = new Thread(this);
        playMusic.setDaemon(true);
        playMusic.start();
    }
    
    public void stop() {
        if(player != null)
            player.close();
    }
    
    private void start(BufferedInputStream inputStream) throws JavaLayerException {
        stop();
        player = new Player(inputStream);
    }

    @Override
    public void run() {
        try {
            player.play();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}