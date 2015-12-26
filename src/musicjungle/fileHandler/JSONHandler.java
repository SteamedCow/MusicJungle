package musicjungle.fileHandler;
import java.io.FileWriter;
import java.io.IOException;
import musicjungle.data.GameData;
import musicjungle.models.Song;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * JSONHandler
 * @author SteamedCow
 * @version 26-12-2015
 */
public class JSONHandler 
{
    public static void save() {
        final JSONArray list = new JSONArray();
        JSONObject obj;
        for (Song song : GameData.songs) {
            obj = new JSONObject();
            obj.put("Title", song.title);
            obj.put("Artist", song.artist);
            obj.put("Album", song.album);
            obj.put("Duration", song.duration);
            obj.put("BitRate", song.bitRate);
            obj.put("FilePath", song.filepath);
            list.add(obj);
        }

        try {
            try (FileWriter file = new FileWriter("save/songs.json")) {
                file.write(list.toJSONString());
                file.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}