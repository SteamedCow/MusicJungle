package musicjungle.fileHandler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import musicjungle.fileHandler.gui.FileHandlerController;

/**
 * fileBrowserListener
 * @author SteamedCow
 * @version 22-12-2015
 */
public class FileBrowserListener implements ActionListener
{
    private final JFileChooser fc = new JFileChooser();

    public FileBrowserListener() {
        fc.addChoosableFileFilter(new AudioFilter());
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        int returnVal = fc.showOpenDialog(null);
        
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            final File file = fc.getSelectedFile();
            FileHandlerController.setSelectedFile(file);
        }
    }
}