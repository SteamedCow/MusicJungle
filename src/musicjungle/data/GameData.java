package musicjungle.data;
import java.util.ArrayList;
import musicjungle.models.Song;
import musicjungle.musicPlayer.MP3Player;

/**
 * GameData
 * @author Lasse
 * @version 23-12-2015
 */
public class GameData 
{
    public static final ArrayList<Song> songs = new ArrayList();
    public static final MP3Player musicPlayer = new MP3Player();
}