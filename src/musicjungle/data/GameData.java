package musicjungle.data;
import java.util.ArrayList;
import musicjungle.models.Song;
import musicjungle.musicPlayer.MP3Player;

/**
 * GameData
 * @author SteamedCow
 * @version 23-12-2015
 */
public class GameData 
{
    public static final int MAX_SONG_BUTTON_COUNT = 9;
    public static final int MIN_SONG_BUTTON_COUNT = 2;
    public static final int SONG_BUTTON_COUNT = 4;
    public static final int ROUND_TIME = 10;
    public static final int MAX_ROUND_TIME = 300 * 1000;
    public static final int MIN_ROUND_TIME = 1 * 1000;
    public static final int COOLDOWN_BETWEEN_ROUNDS = 1 * 1000;
    
    public static final ArrayList<Song> songs = new ArrayList();
    public static final MP3Player musicPlayer = new MP3Player();
    
    public static final String CORRECT_SFX_PATH = "/musicjungle/data/sfx/Correct.wav";
    public static final String INCORRECT_SFX_PATH = "/musicjungle/data/sfx/Incorrect.wav";
    
    public static ArrayList<Song> getRandomSongs(int songCount, int playDuration) {
        final ArrayList<Song> randomSongs = new ArrayList<>();
        final ArrayList<Song> songsCopy = (ArrayList<Song>) songs.clone();
        int listSize = songsCopy.size();
        
        if(listSize < songCount)
            throw new IndexOutOfBoundsException("There's too few songs in the avalible song list for the chosen button count");
        
        int index;
        while(randomSongs.size() < songCount) {
            index = Utils.getRandomInteger(0, listSize - 1);
            randomSongs.add(songsCopy.get(index));
            songsCopy.remove(index);
            listSize--;
        }
        
        return randomSongs;
    }
}