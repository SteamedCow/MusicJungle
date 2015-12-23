package musicjungle.fileHandler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import musicjungle.data.CodingConstants;
import musicjungle.data.GameData;
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
        fc.addChoosableFileFilter(new AudioFilter());
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        switch (evt.getActionCommand().toUpperCase()) {
            case CodingConstants.BROWSE_BUTTON_AC: {
                browse(); break;
            }
            case CodingConstants.ADD_BUTTON_AC: {
                add(); break;
            }
            case CodingConstants.CANCEL_BUTTON_AC: {
                cancel(); break;
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
    
    private void add() {
        GameData.songs.add(FileHandlerController.getSong());
        
        for (Song song : GameData.songs) {
            System.out.println(song.toString());
        }
        
    }

    private void cancel() {
        try {
            throw new UnsupportedOperationException("Not supported yet.");
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();
        }  
    }
}