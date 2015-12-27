package musicjungle;
import javax.swing.JFrame;
import musicjungle.data.CodingConstants;
import musicjungle.data.GameData;
import musicjungle.fileHandler.JSONHandler;
import musicjungle.fileHandler.gui.FileHandlerController;
import musicjungle.models.Song;

/**
 * MusicJungle
 * @author SteamedCow
 * @version 17-12-2015
 */
public class MusicJungle 
{
    public static void main(String[] args) {
        GameData.songs.addAll(JSONHandler.loadSongs(CodingConstants.JSON_FILEPATH));
        
        for (Song song : GameData.songs) {
            System.out.println(song);
        }
        
        JFrame frame = new JFrame("TEMP");
//        GameController controller = new GameController(4, 10);
        FileHandlerController controller = new FileHandlerController();
        
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(controller.getPanel());
        frame.setVisible(true);
        
//        GameController.startRound();
    }
}