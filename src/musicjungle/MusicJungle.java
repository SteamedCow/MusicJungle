package musicjungle;
import javax.swing.JFrame;
import musicjungle.fileHandler.gui.FileHandlerController;
import musicjungle.game.gui.GameController;

/**
 * MusicJungle
 * @author SteamedCow
 * @version 17-12-2015
 */
public class MusicJungle 
{
    public static void main(String[] args) {        
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