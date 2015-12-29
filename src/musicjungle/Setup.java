package musicjungle;
import musicjungle.data.GameData;
import musicjungle.fileHandler.JSONHandler;

/**
 * Setup
 * @author SteamedCow
 * @version 28-12-2015
 */
public class Setup 
{    
    public void loadSongs(String jsonPath) {
        GameData.songs.addAll(JSONHandler.loadSongs(jsonPath));
        System.out.println("Songs loaded: " + GameData.songs.size());
    }
}