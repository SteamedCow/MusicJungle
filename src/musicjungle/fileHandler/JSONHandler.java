package musicjungle.fileHandler;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import musicjungle.data.CodingConstants;
import musicjungle.models.Song;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * JSONHandler
 * @author SteamedCow
 * @version 26-12-2015
 */
public class JSONHandler 
{
    public static void saveSongs(ArrayList<Song> songs, String jsonPath) {
        final JSONArray list = new JSONArray();
        JSONObject obj;
        for (Song song : songs) {
            obj = new JSONObject();
            obj.put(CodingConstants.JSON_TAG_TITLE, song.title);
            obj.put(CodingConstants.JSON_TAG_ARTIST, song.artist);
            obj.put(CodingConstants.JSON_TAG_ALBUM, song.album);
            obj.put(CodingConstants.JSON_TAG_DURATION, song.duration);
            obj.put(CodingConstants.JSON_TAG_BITRATE, song.bitRate);
            obj.put(CodingConstants.JSON_TAG_FILEPATH, song.filepath);
            list.add(obj);
        }

        try {
            try (FileWriter file = new FileWriter(CodingConstants.JSON_FILEPATH)) {
                file.write(list.toJSONString());
                file.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static ArrayList<Song> loadSongs(String jsonPath) {
        final JSONParser parser = new JSONParser();
        final ArrayList<Song> songs = new ArrayList<>();
        
        try {
            final Object obj = parser.parse(new FileReader(jsonPath));
            final JSONArray jsonSongs = (JSONArray) obj;
            
            JSONObject jsonSong;
            Song song;
            for (Object jsonObj : jsonSongs) {
                jsonSong = (JSONObject) jsonObj;
                song = new Song((String) jsonSong.get(CodingConstants.JSON_TAG_TITLE),
                        (String) jsonSong.get(CodingConstants.JSON_TAG_ARTIST),
                        (String) jsonSong.get(CodingConstants.JSON_TAG_ALBUM),
                        (String) jsonSong.get(CodingConstants.JSON_TAG_FILEPATH),
                        (int) (long) jsonSong.get(CodingConstants.JSON_TAG_DURATION),
                        (int) (long) jsonSong.get(CodingConstants.JSON_TAG_BITRATE));
                songs.add(song);
            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return songs;
    }
}