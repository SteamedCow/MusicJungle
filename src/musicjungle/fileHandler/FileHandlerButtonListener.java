package musicjungle.fileHandler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javazoom.jl.decoder.JavaLayerException;
import musicjungle.data.*;
import musicjungle.fileHandler.gui.FileHandlerController;
import musicjungle.models.Song;

/**
 * fileBrowserListener
 * @author SteamedCow
 * @version 22-12-2015
 */
public class FileHandlerButtonListener implements ActionListener
{
    private final JFileChooser fc = new JFileChooser();

    public FileHandlerButtonListener() {
        fc.setAcceptAllFileFilterUsed(false);
        fc.addChoosableFileFilter(new AudioFilter());
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        switch (evt.getActionCommand().toUpperCase()) {
            case CodingConstants.BROWSE_BUTTON_AC: {
                browse(); break;
            }
            case CodingConstants.PLAY_MUSIC_BUTTON_AC: {
                playSelectedSong(); break;
            }
            case CodingConstants.ADD_BUTTON_AC: {
                add(); break;
            }
            case CodingConstants.CANCEL_BUTTON_AC: {
                cancel(); break;
            }
            default: {
                System.err.println("Buttons action command does not match any cases: " + evt.getActionCommand());
            }
        }
    }
    
    private void browse() {
        int returnVal = fc.showOpenDialog(null);
        
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            final File file = fc.getSelectedFile();
            FileHandlerController.setSelectedFile(file);
        }
    }

    private void playSelectedSong() {
        try {
            final Song song = FileHandlerController.getSong();
            GameData.musicPlayer.play(song, song.duration / 2);
        } catch (JavaLayerException | IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private void add() {
        GameData.songs.add(FileHandlerController.getSong());
        
        for (Song song : GameData.songs) {
            GameData.musicPlayer.stop();
            System.out.println(song.toString());
        }
    }

    private void cancel() {
        try {
            GameData.musicPlayer.stop();
            throw new UnsupportedOperationException("Not supported yet.");
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }  
    }
}