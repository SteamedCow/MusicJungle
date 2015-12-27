package musicjungle.models;
import java.util.Objects;

/**
 * Song
 * @author SteamedCow
 * @version 23-12-2015
 */
public class Song 
{
    public final String title, artist, album, filepath;
    public final int duration, bitRate;

    public Song(String title, String artist, String album, String filepath, int duration, int bitRate) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.filepath = filepath;
        this.duration = duration;
        this.bitRate = bitRate;
    }
    
    public String toSimpleString() {
        return artist + " - " + title;
    }

    @Override
    public String toString() {
        return "Song{" + "title=" + title + ", artist=" + artist + ", album=" + album + ", filepath=" + filepath + ", duration=" + duration + ", bitRate=" + bitRate + '}';
    }

    public boolean weakEquals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) 
            return false;
        final Song other = (Song) obj;
        
        if(Objects.equals(this.filepath, other.filepath))
            return true;
        
        return Objects.equals(this.title, other.title) &&
                Objects.equals(this.album, other.album);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.title);
        hash = 67 * hash + Objects.hashCode(this.artist);
        hash = 67 * hash + Objects.hashCode(this.album);
        hash = 67 * hash + Objects.hashCode(this.filepath);
        hash = 67 * hash + this.duration;
        hash = 67 * hash + this.bitRate;
        return hash;
    }
}