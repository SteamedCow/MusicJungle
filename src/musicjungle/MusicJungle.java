package musicjungle;
import javax.swing.JFrame;
import musicjungle.data.*;
import musicjungle.fileHandler.JSONHandler;
import musicjungle.fileHandler.gui.FileHandlerController;
import musicjungle.models.Song;
import musicjungle.round.gui.RoundController;

/**
 * MusicJungle
 * @author SteamedCow
 * @version 17-12-2015
 */
public class MusicJungle 
{
    public static void main(String[] args) {
        GameData.songs.addAll(JSONHandler.loadSongs(CodingConstants.JSON_FILEPATH));
        System.out.println("Songs loaded: " + GameData.songs.size());
                
        JFrame frame = new JFrame("TEMP");
        RoundController controller = new RoundController();
//        FileHandlerController controller = new FileHandlerController();
        
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(controller.getPanel());
        frame.setVisible(true);
        
        RoundController.newRound(GameData.SONG_BUTTON_COUNT, GameData.ROUND_TIME);
        RoundController.startRound();
    }
}