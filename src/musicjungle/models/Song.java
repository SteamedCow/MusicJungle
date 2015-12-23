package musicjungle.models;
import java.io.File;

/**
 * Song
 * @author Lasse
 * @version 23-12-2015
 */
public class Song 
{
    public final String title, artist, album, filepath;
    public final int duration;
    private final File song;

    public Song(String title, String artist, String album, String filepath, int duration, File song) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.filepath = filepath;
        this.duration = duration;
        this.song = song;
    }
    
    public File getSong() {
        return song;
    }

    @Override
    public String toString() {
        return "Song{" + "title=" + title + ", artist=" + artist + ", album=" + album + ", filepath=" + filepath + ", duration=" + duration + '}';
    }
}