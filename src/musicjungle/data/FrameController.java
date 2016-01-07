package musicjungle.data;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.JPanel;
import musicjungle.fileHandler.gui.FileHandlerController;
import musicjungle.round.gui.RoundController;

/**
 * FrameController
 * @author SteamedCow
 * @version 07-01-2016
 */
public class FrameController 
{
    public static final int ADD_SONG_SCREEN = 0;
    public static final int USER_MENU = 1;
    public static final int ADMIN_MENU = 2;
    
    public static void gotoPanel(JPanel panel) {
        final JFrame frame = GUIData.FRAME;
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel);
        frame.revalidate();
    }
    
    public static void gotoPanel(int panel) {
        final JFrame frame = GUIData.FRAME;
        frame.getContentPane().removeAll();
        
        switch(panel) {
            default:
            case ADD_SONG_SCREEN: {
                RoundController.stopRound();
                frame.setTitle("Music Jungle - Add Song");
                frame.getContentPane().add(new FileHandlerController().getPanel());
                break;
            }
//            case USER_MENU: {
//                frame.setTitle("Jet Transport - Menu");
//                StartScreen.pause(true);
//                frame.getContentPane().add(new BrugerMenuController().getView());
//                ActivityListener.poke();
//                ActivityListener.pause(false);
//                break;
//            }
//            case ADMIN_MENU: {
//                try {
//                    throw new UnsupportedOperationException("Not supported yet.");
//                } catch (UnsupportedOperationException e) {
//                    Log.logger.log(Level.SEVERE, "Could not go to admin menu: {0}", e.toString());
//                }
//                break;
//            }
        }
        
        frame.revalidate();
    }
}