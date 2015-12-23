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
    private File song;
//    private RandomAccessFile raf;

    protected FileHandlerModel(FileHandlerView view) {
        this.view = view;
    }

    protected void setFile(File file) {
        song = file;
        
        try {
            final AudioFile audioFile = AudioFileIO.read(song);
            final Tag tag = audioFile.getTag();
            
            view.setFilepath(song.getPath());
            view.setFileName(song.getName());
            view.setSongTitle(tag.getValue(FieldKey.TITLE, 0));
            view.setArtist(tag.getValue(FieldKey.ARTIST, 0));
            view.setAlbum(tag.getValue(FieldKey.ALBUM, 0));
            view.setDuration("" + audioFile.getAudioHeader().getTrackLength());
            
            
//            raf = new RandomAccessFile(file, "r");
//            raf.seek(file.length() - CodingConstants.METADATA_LENGTH);
//            
//            raf.skipBytes(CodingConstants.METADATA_TAG_LENGTH);
//            title = readSection(CodingConstants.METADATA_TITLE_LENGTH);
//            artist = readSection(CodingConstants.METADATA_ARTIST_LENGTH);
//            album = readSection(CodingConstants.METADATA_ALBUM_LENGTH);
            
//            view.setFilepath(file.getPath());
//            view.setFileName(file.getName());
//            view.setSongTitle(title);
//            view.setArtist(artist);
//            view.setAlbum(album);
//            view.setDuration("" + getSongDuration(file));
        } catch (IOException | CannotReadException | InvalidAudioFrameException | ReadOnlyFileException | TagException ex) {
            System.err.println(ex);
        }
    }
    
//    private String readSection(int length) throws IOException {
//        final StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < length; i++) {
//            sb.append((char) raf.read());
//        }
//        return sb.toString().trim();
//    }

    protected Song createSong() {
        final String title = view.getSongTitle();
        final String artist = view.getArtist();
        final String album = view.getAlbum();
        final String filepath = view.getFilepath();
        final int duration = Integer.parseInt(view.getDuration());
        
        return new Song(title, artist, album, filepath, duration, song);
    }
}