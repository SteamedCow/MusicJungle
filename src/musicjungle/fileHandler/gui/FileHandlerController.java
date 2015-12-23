package musicjungle.fileHandler.gui;
import java.io.File;
import javax.swing.JPanel;
import musicjungle.fileHandler.FileHandlerButtonListener;
import musicjungle.models.Song;

/**
 * FileHandlerController
 * @author SteamedCow
 * @version 22-12-2015
 */
public class FileHandlerController 
{
    private final FileHandlerView view;
    private static FileHandlerModel model;

    public FileHandlerController() {
        this.view = new FileHandlerView();
        
        this.view.addButtonListener(new FileHandlerButtonListener());
        
        FileHandlerController.model = new FileHandlerModel(view);
    }
    
    public JPanel getPanel() {
        return view;
    }
    
    public static void setSelectedFile(File f) {
        model.setFile(f);
    }
    
    public static Song getSong() {
        return model.createSong();
    }
}