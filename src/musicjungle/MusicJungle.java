package musicjungle;
import javax.swing.JFrame;
import musicjungle.data.*;
import musicjungle.fileHandler.gui.FileHandlerController;
import musicjungle.round.gui.RoundController;

/**
 * MusicJungle
 * @author SteamedCow
 * @version 17-12-2015
 */
public class MusicJungle 
{
    public static void main(String[] args) {
        final Setup setup = new Setup();
        
        setup.loadSongs(CodingConstants.JSON_FILEPATH);
                
        final JFrame frame = new JFrame("TEMP");
        final RoundController controller = new RoundController();
//        final FileHandlerController controller = new FileHandlerController();
        
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(controller.getPanel());
        frame.setVisible(true);
        
        RoundController.setRound(GameData.SONG_BUTTON_COUNT, GameData.ROUND_TIME);
        RoundController.newRound();
    }
}