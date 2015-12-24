package musicjungle.fileHandler.gui;
import java.io.*;
import musicjungle.models.Song;
import org.jaudiotagger.audio.*;
import org.jaudiotagger.audio.exceptions.*;
import org.jaudiotagger.tag.*;

/**
 * FileHandlerModel
 * @author SteamedCow
 * @version 22-12-2015
 */
public class FileHandlerModel 
{
    private final FileHandlerView view;

    protected FileHandlerModel(FileHandlerView view) {
        this.view = view;
    }

    protected void setFile(File file) {
        final File song = file;
        
        try {
            final AudioFile audioFile = AudioFileIO.read(song);
            final Tag tag = audioFile.getTag();
            
            view.setFilepath(song.getPath());
            view.setFileName(song.getName());
            view.setSongTitle(tag.getValue(FieldKey.TITLE, 0));
            view.setArtist(tag.getValue(FieldKey.ARTIST, 0));
            view.setAlbum(tag.getValue(FieldKey.ALBUM, 0));
            view.setDuration("" + audioFile.getAudioHeader().getTrackLength());
            view.setBitRate(audioFile.getAudioHeader().getBitRate());
            view.playButtonEnable(true);
        } catch (IOException | CannotReadException | InvalidAudioFrameException | ReadOnlyFileException | TagException ex) {
            ex.printStackTrace();
        }
    }

    protected Song createSong() {
        final String title = view.getSongTitle();
        final String artist = view.getArtist();
        final String album = view.getAlbum();
        final String filepath = view.getFilepath();
        final int duration = Integer.parseInt(view.getDuration());
        final int bitRate = Integer.parseInt(view.getBitRate());
        
        return new Song(title, artist, album, filepath, duration, bitRate);
    }
}