package musicjungle.fileHandler.gui;
import java.io.File;
import javax.swing.JPanel;
import musicjungle.fileHandler.FileBrowserListener;

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
        
        this.view.addBrowserListener(new FileBrowserListener());
        
        FileHandlerController.model = new FileHandlerModel(view);
    }
    
    public JPanel getPanel() {
        return view;
    }
    
    public static void setSelectedFile(File f) {
        model.setFile(f);
    }
}