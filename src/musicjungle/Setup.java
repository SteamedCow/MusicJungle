package musicjungle;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JFrame;
import musicjungle.data.GUIData;
import musicjungle.data.GameData;
import musicjungle.fileHandler.JSONHandler;

/**
 * Setup
 * @author SteamedCow
 * @version 28-12-2015
 */
public class Setup 
{    
    public void loadSongs(String jsonPath) {
        GameData.songs.addAll(JSONHandler.loadSongs(jsonPath));
        System.out.println("Songs loaded: " + GameData.songs.size());
    }
    
    public void setFrame(String title, Dimension dim, boolean visible, Component locRelativeTo, int defCloseOperation) {
        final JFrame frame = GUIData.FRAME;
        
        frame.setTitle(title);
        frame.setSize(dim.width, dim.height);
        frame.setLocationRelativeTo(locRelativeTo);
        frame.setDefaultCloseOperation(defCloseOperation);
        frame.setVisible(visible);
    }
}