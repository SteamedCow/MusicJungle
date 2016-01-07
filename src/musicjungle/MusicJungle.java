package musicjungle;
import java.awt.Dimension;
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
        final RoundController controller = new RoundController();
//        final FileHandlerController controller = new FileHandlerController();
        
        setup.loadSongs(CodingConstants.JSON_FILEPATH);
        setup.setFrame("Music Jungle", new Dimension(500, 500), true, null, JFrame.EXIT_ON_CLOSE);
        
        FrameController.gotoPanel(controller.getPanel());
        
        RoundController.setRound(GameData.SONG_BUTTON_COUNT, GameData.ROUND_TIME);
        RoundController.newRound();
    }
}